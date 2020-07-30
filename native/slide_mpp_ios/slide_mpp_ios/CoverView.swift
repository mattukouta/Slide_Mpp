//
//  CoverView.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/07/30.
//  Copyright © 2020 kouta. All rights reserved.
//

import SwiftUI

struct CoverView: View {
    var title: String
    var body: some View {
        Text("Kotlinで始めるクロスプラットフォーム開発")
            .font(.system(size: 80, weight: .regular, design: .default))
            .padding(.horizontal, 50)
    }
}

struct CoverView_Previews: PreviewProvider {
    static var previews: some View {
        CoverView(title: "title")
    }
}
