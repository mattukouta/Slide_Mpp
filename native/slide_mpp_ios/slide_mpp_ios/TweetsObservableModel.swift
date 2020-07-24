//
//  MPPManagement.swift
//  slide_mpp_ios
//
//  Created by 高松耕太 on 2020/07/23.
//  Copyright © 2020 kouta. All rights reserved.
//

import Foundation
import SharedCode

class TweetsObservableModel: ObservableObject {
    @Published var tweets: String = ""
    
    init() {
        getTweets()
    }
    
    func getTweets(){
        ApiClient().getTweets(
            successCallback:{ response in
                print(response)
                self.tweets = response.statuses?[0].text ?? ""
            }, errorCallback: { error in
                print(error)
                self.tweets = "エラー"
            }
        )
    }
}
