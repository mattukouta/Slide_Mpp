//
//  ContentView.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/07/17.
//  Copyright © 2020 kouta. All rights reserved.
//

import SwiftUI
import UIKit

struct ContentView: View {
    @ObservedObject var observe = TweetsObservableModel()
    
    var body: some View {
        VStack {
            PageView([
                AnyView(SlideView()),
                AnyView(SlideView()),
                AnyView(SlideView()),
                AnyView(SlideView())
            ])
            Text(observe.tweets)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
