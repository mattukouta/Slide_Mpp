//
//  Sample.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/07/30.
//  Copyright © 2020 kouta. All rights reserved.
//

import SwiftUI
import UIKit

struct SlideView: View {
    @ObservedObject var observe = TweetsObservableModel()
    private let slideInfo = SlideFormat()
    
    var body: some View {
        GeometryReader { geometry in
            ZStack {
                VStack {
                    PageView(
                        self.slideInfo.createViewList()
                    ).frame(width: geometry.size.width, height: geometry.size.height - 100)
                    
                    Spacer()
                    
                    Text(self.observe.tweets)
                        .font(.system(size: FontManager().getTweetsFontSize()))
                        .frame(width: geometry.size.width, height: 100)

                }
                
                Spacer()
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        SlideView()
    }
}
