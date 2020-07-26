package com.kouta.slide_mpp

import ApiClient
import android.content.Context
import android.content.res.Configuration
import android.graphics.Point
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.WindowManager
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.fragment.app.FragmentActivity
import getSlideInfo
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : FragmentActivity() {

    private val handler = Handler(Looper.getMainLooper())

    private val slideSmallScale = 3
    private val slideLargeScale = 4
    private var slideHeight = 0
    private var slideWidth = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val paddingDp = convertInt2Dp(116)
        val orientation = getOrientation()

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            slideWidth = getSlideContentLarge(paddingDp)
            slideHeight = getSlideContentSmall(slideWidth, slideSmallScale, slideLargeScale)
        } else if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            slideHeight = getSlideContentLarge(paddingDp)
            slideWidth = getSlideContentSmall(slideHeight, slideLargeScale, slideSmallScale)
        }

        setSlideView(slideWidth, slideHeight, orientation)

        ApiClient().getTweets(
            successCallback = {
                handler.post{tweets.text = it.statuses?.get(0)?.text}
            },
            errorCallback = {
                handler.post{tweets.text = it.toString()}
                Log.d("check", it.toString())
            }
        )

        slide_content.adapter = SlideAdapter(this, getSlideInfo())
    }

    fun convertInt2Dp(paddingDp: Int): Int = (paddingDp * resources.displayMetrics.density + 0.5f).toInt()

    fun getSlideContentLarge(paddingDp: Int): Int {
        val wm = getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val disp = wm.defaultDisplay

        val size = Point()
        disp.getSize(size)

        return if (size.x < size.y) size.x else size.y - paddingDp
    }

    fun getSlideContentSmall(
        slideWidth: Int,
        slideSmallScale: Int,
        slideLargeScale: Int
    ) = slideSmallScale * slideWidth / slideLargeScale

    fun getOrientation(): Int = resources.configuration.orientation

    fun setSlideView(slideWidth: Int, slideHeight: Int, orientation: Int) {
        slide_content.layoutParams = ConstraintLayout.LayoutParams(slideWidth, slideHeight)

        val constraintSet = ConstraintSet()
        constraintSet.clone(activity_main)

        constraintSet.connect(slide_content.id, ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT)
        constraintSet.connect(slide_content.id, ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT)
        constraintSet.connect(slide_content.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP)

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            constraintSet.connect(slide_content.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM)
        }

        constraintSet.applyTo(activity_main)
    }
}