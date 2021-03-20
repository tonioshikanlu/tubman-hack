//
//  RegisterMainView.swift
//  tubmanFigma
//
//  Created by Ehiremen Ekore on 3/20/21.
//

import SwiftUI

struct RegisterMainView: View {
    @State var email = ""
    @State var password = ""
    
    var body: some View {
        VStack (alignment: .leading, spacing: 30) {
            HStack () {
                Text("REGISTER")
                    .bold()
                    .font(.system(size: 18))
                    .cornerRadius(6)
            }
            
            
            TextField("email", text: $email)
                .border(Color.black)
                .keyboardType(UIKeyboardType.emailAddress)
                .autocapitalization(UITextAutocapitalizationType.none)
                .disableAutocorrection(true)
            
            SecureField("Password", text: $password)
                .border(Color.black)
            
            NavigationLink (destination: RegisterHelperView()) {
                Text("NEXT")
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

struct RegisterMainView_Previews: PreviewProvider {
    static var previews: some View {
        RegisterMainView()
    }
}
