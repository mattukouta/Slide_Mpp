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
    var body: some View {
        Text(CommonKt.createApplicationScreenMessage())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
