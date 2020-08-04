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
    
    private let switches = Switch()
    
    func getSendIconSize() -> CGFloat {
        switch switches.when() {
        case 0:
            return 30
        case 1:
            return 30
        case 2:
            return 20
        default:
            return 0
        }
    }
    
    func getArrowIconSize() -> CGFloat {
        
        switch switches.when() {
        case 0:
            return 25
        case 1:
            return 30
        case 2:
            return 20
        default:
            return 0
        }
    }
    
    func getNextIconSize() -> CGFloat {
        switch switches.when() {
        case 0:
            return 25
        case 1:
            return 30
        case 2:
            return 20
        default:
            return 0
        }
    }
    
    func getContentImageHeight() -> CGFloat {
        switch switches.when() {
        case 0:
            return 400
        case 1:
            return 100
        case 2:
            return 100
        default:
            return 100
        }
    }
    
    func getContentImageWidth() -> CGFloat {
        switch switches.when() {
        case 0:
            return 600
        case 1:
            return 100
        case 2:
            return 100
        default:
            return 100
        }
    }
    
    func getImageName(originalImageName: String) -> String {
        switch originalImageName {
        case "myImage.png":
            return "my-image"
        default:
            return ""
        }
    }
}
