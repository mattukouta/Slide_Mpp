//
//  Switch.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/08/02.
//  Copyright © 2020 kouta. All rights reserved.
//

import Foundation
import UIKit

class Switch {
    private let mainBoundSizeWidth: CGFloat = UIScreen.main.bounds.size.width
    private let iPhoneWidth = CGFloat(414)
    private let iPadWidth = CGFloat(1024)
    
    /*
     case 0 -> iPad（横）
     case 1 -> iPhone（縦）
     case 2 -> iPhone（横）
     */
    func when() -> Int {
        if (mainBoundSizeWidth >= iPadWidth) {
            return 0
        } else if(mainBoundSizeWidth <= iPhoneWidth){
            return 1
        } else {
            return 2
        }
    }
}
