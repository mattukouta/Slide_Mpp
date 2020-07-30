//
//  Sample.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/07/30.
//  Copyright © 2020 kouta. All rights reserved.
//

import SwiftUI

struct SlideView: View {
    var text: String
    var body: some View {
        Text("Hello, \(text)")
    }
}

struct Sample_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
