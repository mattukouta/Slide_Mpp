//
//  ContentView.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/07/17.
//  Copyright © 2020 kouta. All rights reserved.
//

import SwiftUI
import SharedCode

struct ContentView: View {
    var slideInfo: Slide
    private let fontManager = FontManager()
    private let imageManager = ImageManager()
    let hoge = ["hoge", "hoge"]
    var body: some View {
        GeometryReader { parentGeometry in
            ScrollView(.vertical) {
                VStack(alignment: .leading, spacing: 0) {
                    Text(self.slideInfo.component2())
                        .font(.system(size: self.fontManager.getContentTitleFontSize()))
                    Rectangle()
                        .fill(Color.red)
                        .frame(width: parentGeometry.size.width, height: 1)
                    
                    HStack {
                        VStack(alignment: .leading, spacing: 0) {
                            ForEach([Slide.SubContent](self.slideInfo.component3() ?? []), id: \.self) { slideContentInfoItem in
                                VStack(spacing: 0) {
                                    HStack {
                                        Image("ic-send")
                                            .resizable()
                                            .frame(width: self.imageManager.getSendIconSize(), height: self.imageManager.getSendIconSize(), alignment: .leading)
                                        
                                        Text(verbatim: "\(slideContentInfoItem.component1().allKeys.first ?? "")")
                                            .font(.system(size: self.fontManager.getContentSubTitleFontSize()))
                                        
                                        Spacer()
                                    }
                                    
                                    ForEach((slideContentInfoItem.component1().allValues.first ?? "") as? [Slide.SubContentSubSubContent] ?? [], id: \.self) { slideSubContentInfoItem in
                                        VStack(spacing: 0) {
                                            HStack {
                                                Image("ic-arrow")
                                                    .resizable()
                                                    .frame(width: self.imageManager.getArrowIconSize(), height: self.imageManager.getArrowIconSize(), alignment: .leading)

                                                Text(verbatim: "\(slideSubContentInfoItem.component1().allKeys.first ?? "")")
                                                    .font(.system(size: self.fontManager.getContentSubSubTitleFontSize()))
                                                
                                                Spacer()
                                            }
                                            
                                            ForEach((slideSubContentInfoItem.component1().allValues.first ?? "") as? [String] ?? [], id: \.self) { slideSubContentItem in
                                                HStack {
                                                    Image("ic-next")
                                                        .resizable()
                                                        .frame(width: self.imageManager.getNextIconSize(), height: self.imageManager.getNextIconSize(), alignment: .leading)

                                                    Text(verbatim: "\(slideSubContentItem)")
                                                    .font(.system(size: self.fontManager.getContentSubSubTitleListFontSize()))
                                                    
                                                    Spacer()
                                                }
                                            }.offset(x: 20, y: 0)
                                        }
                                    }.offset(x: 10, y: 0)
                                }
                            }
                        }.offset(x: 5, y: 0)
                        
                        Spacer()
                        
                        Image(self.imageManager.getImageName(originalImageName: self.slideInfo.component4() ?? ""))
                            .resizable()
                            .scaledToFit()
                            .frame(maxWidth: self.imageManager.getContentImageWidth(), maxHeight: self.imageManager.getContentImageHeight())
                        
                        Spacer()
                    }
                }.offset(x: 5, y: 0)
            }
        }
    }
}

//struct Sample_Previews: PreviewProvider {
//    static var previews: some View {
//        ContentView(text: "title")
//    }
//}


