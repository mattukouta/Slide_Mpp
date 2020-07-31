//
//  ContentView.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/07/17.
//  Copyright © 2020 kouta. All rights reserved.
//

import SwiftUI

struct ContentView: View {
    var text: String
    var body: some View {
        GeometryReader { geometry in
            ScrollView(.vertical) {
                VStack(alignment: .leading, spacing: 0) {
                    Text("Hello, \(self.text)")
                        .font(.largeTitle)
                    Rectangle()
                        .fill(Color.red)
                        .frame(width: geometry.size.width - 100, height: 1)
                    
                    ForEach(1..<3) { localIndex in
                        HStack {
                            Image("ic-send")
                                .resizable()
                                .frame(width: 30, height: 30, alignment: .leading)
                            
                            Text("Hello, \(self.text)")
                                .font(.title)
                        }
                        
                        ForEach(1..<3) { localIndex in
                            HStack {
                                Image("ic-arrow")
                                    .resizable()
                                    .frame(width: 20, height: 20, alignment: .leading)
                                
                                Text("Hello, \(self.text)")
                                .font(.headline)
                            }
                            
                            ForEach(1..<3) { localIndex in
                                HStack {
                                    Image("ic-next")
                                        .resizable()
                                        .frame(width: 20, height: 20, alignment: .leading)
                                    
                                    Text("Hello, \(self.text)")
                                    .font(.body)
                                }
                            }.offset(x: 20, y: 0)
                        }.offset(x: 20, y: 0)
                    }.offset(x: 10, y: 0)
                    
                    Spacer()
                    
                }
            }
        }
    }
}

struct Sample_Previews: PreviewProvider {
    static var previews: some View {
        ContentView(text: "title")
    }
}


