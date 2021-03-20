//
//  RegisterHelperView.swift
//  tubmanFigma
//
//  Created by Ehiremen Ekore on 3/20/21.
//

import SwiftUI

struct RegisterHelperView: View {
    @State var username = ""
    
    var body: some View {
        VStack (alignment: .leading, spacing: 30) {
            HStack () {
                Text("REGISTER")
                    .bold()
                    .font(.system(size: 18))
                    .cornerRadius(6)
            }
            
            TextField("username", text: $username)
                .border(Color.black)
                .autocapitalization(UITextAutocapitalizationType.none)
                .disableAutocorrection(true)
            
            NavigationLink (destination: AppTabView()) {
                Text("SIGN UP")
                    .fontWeight(.black)
                    .foregroundColor(.white)
                    .font(.footnote)
                    .tracking(0.52)
                    .padding(.top, 19)
                    .padding(.bottom, 18)
                    .frame(width: 400, height: 50)
                    .background(Color.black)
                    .cornerRadius(6)
            }
        }.padding()
        .textFieldStyle(RoundedBorderTextFieldStyle())
    }
}

struct RegisterHelperView_Previews: PreviewProvider {
    static var previews: some View {
        RegisterHelperView()
    }
}
