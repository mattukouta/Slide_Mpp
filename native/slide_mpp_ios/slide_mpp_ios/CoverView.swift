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
        GeometryReader { geometry in
            Text("Kotlinで始めるクロスプラットフォーム開発")
                .font(.system(size: FontManager().getCoverTitleFontSize()))
                .frame(width: geometry.size.width)
        }
    }
}

struct CoverView_Previews: PreviewProvider {
    static var previews: some View {
        CoverView(title: "title")
    }
}
