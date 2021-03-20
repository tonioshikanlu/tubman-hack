//
//  EnvVar.swift
//  tubmanFigma
//
//  Created by Ehiremen Ekore on 3/20/21.
//

import UIKit

class EnvVar: ObservableObject{
    @Published var isLoggedIn: Bool
    @Published var username: String
    
    init () {
        self.isLoggedIn = false
        self.username = ""
        print("not logged in");
    }
    
    func logIn (uName: String) -> Bool {
        if (!uName.isEmpty) {
            self.username = uName
            self.isLoggedIn = true
            return true
        }
        else {
            return false
        }
    }
}
