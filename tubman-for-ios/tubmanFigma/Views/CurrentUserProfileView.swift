//
//  CurrentUserProfile.swift
//  tubmanFigma
//
//  Created by Ehiremen Ekore on 3/20/21.
//

import SwiftUI

struct CurrentUserProfileView: View {
    var body: some View {
        VStack (alignment: .center, spacing: 10) {
            HStack(alignment: .center) {
                Image("aj")
                    .resizable()
                    .aspectRatio(contentMode: .fill)
                    .frame(width: 150.0, height: 150, alignment: .center)
                    .clipShape(Circle())
            }
            
            
            Text("AJ ASOG")
                .bold()
                .font(.system(size: 25))
                .cornerRadius(6)
            
            Text("WASHINGTON DC")
                .bold()
                .font(.system(size: 14))
                .cornerRadius(6)
            
            HStack (alignment: .center, spacing: 10) {
                Spacer()
                VStack (alignment: .center) {
                    Text("FOLLOWERS")
                        .bold()
                        .font(.system(size: 14))
                        .cornerRadius(6)
                    
                    Text("53")
                        .bold()
                        .font(.system(size: 14))
                        .cornerRadius(6)
                }.padding(10)
                
                VStack (alignment: .center) {
                    Text("FOLLOWING")
                        .bold()
                        .font(.system(size: 14))
                        .cornerRadius(6)
                    
                    Text("777")
                        .bold()
                        .font(.system(size: 14))
                        .cornerRadius(6)
                }.padding(10)
                Spacer()
            }
            
            List (){
                Spacer()
                
                VStack (alignment: .leading) {
                    Spacer()
                    Text("Investing")
                        .bold()
                        .font(.system(size: 18))
                        .cornerRadius(6)
                    
                    Text("Margins, Options, Paper Trading")
                        .font(.system(size: 14))
                        .cornerRadius(6)
                    Spacer()
                }.frame(height: 50)
                
                VStack (alignment: .leading) {
                    Spacer()
                    Text("Transfers")
                        .bold()
                        .font(.system(size: 18))
                        .cornerRadius(6)
                    
                    Text("Deposits, Withdrawals")
                        .font(.system(size: 14))
                        .cornerRadius(6)
                    Spacer()
                }.frame(height: 50)

                
                VStack (alignment: .leading) {
                    Spacer()
                    Text("Statements")
                        .bold()
                        .font(.system(size: 18))
                        .cornerRadius(6)
                    
                    Text("Documents, Taxes")
                        .font(.system(size: 14))
                        .cornerRadius(6)
                    Spacer()
                }.frame(height: 50)

                
                VStack (alignment: .leading) {
                    Spacer()
                    Text("Settings")
                        .bold()
                        .font(.system(size: 18))
                        .cornerRadius(6)
                    
                    Text("Account details, Security, Privacy, Log Out")
                        .font(.system(size: 14))
                        .cornerRadius(6)
                    Spacer()
                }.frame(height: 50)

                
                VStack (alignment: .leading) {
                    Spacer()
                    Text("Help")
                        .bold()
                        .font(.system(size: 18))
                        .cornerRadius(6)
                    
                    Text("Customer support")
                        .font(.system(size: 14))
                        .cornerRadius(6)
                    Spacer()
                }.frame(height: 50)

            }
        }
    }
}

struct CurrentUserProfileView_Previews: PreviewProvider {
    static var previews: some View {
        CurrentUserProfileView()
    }
}
