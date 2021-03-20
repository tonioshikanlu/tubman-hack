//
//  Login.swift
//  tubmanFigma
//
//  Created by Ehiremen Ekore on 3/20/21.
//

import SwiftUI

struct LoginView: View {
    @EnvironmentObject var isLoggedIn: EnvVar
    @Environment(\.presentationMode) var presentationMode
    @State var email = ""
    @State var password = ""
    
    var body: some View {
        VStack (alignment: .leading, spacing: 30) {
            HStack () {
                Text("LOG IN")
                    .bold()
                    .font(.system(size: 18))
                    .cornerRadius(6)
            }
            
            
            TextField("email", text: $email)
                .border(Color.black)
                .keyboardType(UIKeyboardType.emailAddress)
                .autocapitalization(UITextAutocapitalizationType.none)
                .disableAutocorrection(true)
                .frame(width: 400, height: 50)
            
            SecureField("Password", text: $password)
                .border(Color.black)
            
            NavigationLink (destination: AppTabView()) {
                
                Text("LOG IN")
                    .fontWeight(.black)
                    .foregroundColor(.white)
                    .font(.footnote)
                    .tracking(0.52)
                    .padding(.top, 19)
                    .padding(.bottom, 18)
                    .frame(width: 167, height: 52)
                    .background(Color.black)
                    .cornerRadius(6)
            }.padding(.leading, 90)
        }.padding()
        .textFieldStyle(RoundedBorderTextFieldStyle())

    }
    
    func logIn() {
        let worked = isLoggedIn.logIn(uName: email)
        if (!worked) {
            print("fatal error")
        }
        else {
            print("logged in")
        }
        presentationMode.wrappedValue.dismiss()
    }
}

struct LoginView_Previews: PreviewProvider {
    static var previews: some View {
        LoginView()
    }
}
