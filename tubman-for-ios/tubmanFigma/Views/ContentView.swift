//
//  ContentView.swift
//  tubmanFigma
//
//  Created by Ehiremen Ekore on 3/20/21.
//

import SwiftUI

struct ContentView: View {
    @EnvironmentObject var isLoggedIn: EnvVar
    
    var body: some View {
        NavigationView {
            LandingView()
        }
        
        
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
//        static let isLoggedIn = EnvVar()
        ContentView()
    }
}
