package com.kouta.slide_mpp

import ApiClient
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.FragmentActivity
import createApplicationScreenMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {

    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        platformName.text = createApplicationScreenMessage()

//        Log.d("check", ApiClient().)
        ApiClient().getTweets(
            successCallback = {
                handler.post{platformName.text = it.productId}
            },
            errorCallback = {
                handler.post{platformName.text = it.toString()}
            }
        )

        slide_content.adapter = SlideAdapter(this)
    }
}