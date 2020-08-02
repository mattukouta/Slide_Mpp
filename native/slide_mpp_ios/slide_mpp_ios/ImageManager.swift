//
//  ImageManager.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/08/02.
//  Copyright © 2020 kouta. All rights reserved.
//

import Foundation
import UIKit

class ImageManager {
    let mainBoundSizeWidth: CGFloat = UIScreen.main.bounds.size.width
    let iPhoneWidth = CGFloat(414)
    let iPadWidth = CGFloat(1024)
    
    func getSendIconSize() -> CGFloat {
        if (mainBoundSizeWidth >= iPadWidth) {
            return 30
        } else if(mainBoundSizeWidth <= iPhoneWidth){
            return 30
        } else {
            return 20
        }
    }
    
    func getArrowIconSize() -> CGFloat {
        if (mainBoundSizeWidth >= iPadWidth) {
            return 25
        } else if(mainBoundSizeWidth <= iPhoneWidth){
            return 30
        } else {
            return 20
        }
    }
    
    func getNextIconSize() -> CGFloat {
        if (mainBoundSizeWidth >= iPadWidth) {
            return 25
        } else if(mainBoundSizeWidth <= iPhoneWidth){
            return 30
        } else {
            return 20
        }
    }
}
