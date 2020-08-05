//
//  PageView.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/07/30.
//  Copyright © 2020 kouta. All rights reserved.
//

import SwiftUI

struct PageView<Page: View>: View {
    @State var viewControllers: [UIHostingController<Page>]
    @State var currentPage = 0

    init(_ views: [Page]) {
        _viewControllers = State(initialValue: views.map { UIHostingController(rootView: $0) })
    }

    var body: some View {
        ZStack(alignment: .bottomTrailing) {
            PageViewController(controllers: viewControllers, currentPage: $currentPage)
            
            if (currentPage != 0) {
                Text("\(currentPage)").font(.system(size: FontManager().getContentSubTitleFontSize()))
            }
        }
    }
}
