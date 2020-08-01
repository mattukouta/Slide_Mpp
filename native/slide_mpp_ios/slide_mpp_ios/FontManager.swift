//
//  FontManager.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/07/31.
//  Copyright © 2020 kouta. All rights reserved.
//

import Foundation
import UIKit

class FontManager {
    let mainBoundSizeWidth: CGFloat = UIScreen.main.bounds.size.width
    let iPhoneWidth = CGFloat(414)
    let iPadWidth = CGFloat(1024)
    
    func getCoverTitleFontSize() -> CGFloat {
        if (mainBoundSizeWidth >= iPadWidth) {
            return 80
        } else if(mainBoundSizeWidth <= iPhoneWidth){
            return 30
        } else {
            return 50
        }
    }
    
    func getDoorTitleFontSize() -> CGFloat {
        if (mainBoundSizeWidth >= iPadWidth) {
            return 70
        } else if(mainBoundSizeWidth <= iPhoneWidth){
            return 20
        } else {
            return 40
        }
    }
    
    func getContentTitleFontSize() -> CGFloat {
        if (mainBoundSizeWidth >= iPadWidth) {
            return 55
        } else if(mainBoundSizeWidth <= iPhoneWidth){
            return 20
        } else {
            return 35
        }
    }
    
    func getContentSubTitleFontSize() -> CGFloat {
        if (mainBoundSizeWidth >= iPadWidth) {
            return 50
        } else if(mainBoundSizeWidth <= iPhoneWidth){
            return 20
        } else {
            return 30
        }
    }
    
    func getContentSubSubTitleFontSize() -> CGFloat {
        if (mainBoundSizeWidth >= iPadWidth) {
            return 40
        } else if(mainBoundSizeWidth <= iPhoneWidth){
            return 20
        } else {
            return 25
        }
    }
    func getContentSubSubTitleListFontSize() -> CGFloat {
        if (mainBoundSizeWidth >= iPadWidth) {
            return 30
        } else if(mainBoundSizeWidth <= iPhoneWidth){
            return 20
        } else {
            return 25
        }
    }
}
