//
//  DoorView.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/07/30.
//  Copyright © 2020 kouta. All rights reserved.
//

import SwiftUI
import SharedCode

struct DoorView: View {
    var slideInfo: Slide
    var body: some View {
        GeometryReader { geometry in
            ZStack {
                Image("slide_background")
                .resizable()
                .frame(width: geometry.size.width, height: geometry.size.height)
                
                Text(self.slideInfo.component2())
                    .font(.system(size: FontManager().getDoorTitleFontSize()))
                    .frame(width: geometry.size.width)
            }
        }
    }
}

//struct DoorView_Previews: PreviewProvider {
//    static var previews: some View {
//        DoorView(title: "title")
//    }
//}
