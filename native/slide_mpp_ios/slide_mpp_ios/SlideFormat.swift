//
//  SlideFormat.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/07/30.
//  Copyright © 2020 kouta. All rights reserved.
//

import SharedCode
import SwiftUI

class SlideFormat {
    private var slideInfo: [Slide] = []
    
    init() {
        self.slideInfo = getSlideInfo()
        print(slideInfo.count)
    }
    
    private func getSlideInfo() -> [Slide] { return CommonKt.getSlideInfo()}
    
    func createViewList() -> [AnyView] {
        var viewList: [AnyView] = []
        
        for slideInfoItem in slideInfo {
            switch slideInfoItem.component1() {
                case "cover":
                    viewList.append(AnyView(CoverView(slideInfo: slideInfoItem)))
                case "door":
                    viewList.append(AnyView(DoorView(slideInfo: slideInfoItem)))
                case "content":
                    viewList.append(AnyView(ContentView(slideInfo: slideInfoItem)))
                default:
                    print("create error")
            }
        }
        
        return viewList
    }
}
