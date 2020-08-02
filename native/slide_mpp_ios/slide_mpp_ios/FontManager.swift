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
    
    private let switches = Switch()
    
    func getCoverTitleFontSize() -> CGFloat {
        switch switches.when() {
        case 0:
            return 80
        case 1:
            return 30
        case 2:
            return 50
        default:
            return 0
        }
    }
    
    func getDoorTitleFontSize() -> CGFloat {
        switch switches.when() {
        case 0:
            return 70
        case 1:
            return 20
        case 2:
            return 40
        default:
            return 0
        }
    }
    
    func getContentTitleFontSize() -> CGFloat {
        switch switches.when() {
        case 0:
            return 55
        case 1:
            return 20
        case 2:
            return 30
        default:
            return 0
        }
    }
    
    func getContentSubTitleFontSize() -> CGFloat {
        switch switches.when() {
        case 0:
            return 50
        case 1:
            return 20
        case 2:
            return 25
        default:
            return 0
        }
    }
    
    func getContentSubSubTitleFontSize() -> CGFloat {
        switch switches.when() {
        case 0:
            return 40
        case 1:
            return 20
        case 2:
            return 20
        default:
            return 0
        }
    }
    
    func getContentSubSubTitleListFontSize() -> CGFloat {
        switch switches.when() {
        case 0:
            return 30
        case 1:
            return 20
        case 2:
            return 20
        default:
            return 0
        }
    }
}
