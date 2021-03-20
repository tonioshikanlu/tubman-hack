//
//  DummyView.swift
//  tubmanFigma
//
//  Created by Ehiremen Ekore on 3/20/21.
//

import SwiftUI

struct AppTabView: View {
    
@State private var selected = 4
    
    var body: some View {
        TabView (selection: $selected){
            Dummy2().tabItem{
                Image(systemName:"macwindow.on.rectangle")
            }.navigationBarHidden(true)
            .tag(0)
            
            Dummy2().tabItem{
                Image(systemName:"magnifyingglass")
            }.navigationBarHidden(true)
            .tag(1)
            
            PortfolioView().tabItem{
                Image(systemName:"arrow.up.forward.app")
            }.navigationBarHidden(true)
            .tag(2)
            
            Dummy2().tabItem{
                Image(systemName:"bubble.left")
            }.navigationBarHidden(true)
            .tag(3)
            
            CurrentUserProfileView().tabItem{
                Image(systemName:"person")
            }.navigationBarHidden(true)
            .tag(4)
        }
        
        
    }
}

struct AppTabView_Previews: PreviewProvider {
    static var previews: some View {
        AppTabView()
    }
}
