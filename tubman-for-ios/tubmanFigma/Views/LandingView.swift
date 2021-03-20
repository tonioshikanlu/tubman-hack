
import SwiftUI

struct LandingView: View {
    var body: some View {
            VStack(alignment: .center, spacing: 10) {
                Image("tubman_logo")
                    .resizable()
                    .aspectRatio(contentMode: .fill)
                    .frame(width: 190.0, height: 190, alignment: .center)
                
                Text("tubman")
                    .font(.largeTitle)
                    .multilineTextAlignment(.center)
                    .frame(width: 193, height: 52)
                
                Spacer(minLength: 20)
                
                HStack(alignment: .bottom, spacing: 5) {
                    NavigationLink( destination: LoginView() )
                    {
                        Text("LOG IN")
                            .fontWeight(.black)
                            .font(.footnote)
                            .tracking(0.52)
                            .padding(.top, 19)
                            .padding(.bottom, 18)
                            .frame(width: 167, height: 52)
                            .background(Color.white)
                            .cornerRadius(6)
                            .overlay(RoundedRectangle(cornerRadius: 6).stroke(Color.black, lineWidth: 2))
                    }
                    NavigationLink( destination: RegisterMainView() )
                    {
                    Text("REGISTER")
                        .fontWeight(.black)
                        .foregroundColor(.white)
                        .font(.footnote)
                        .tracking(0.52)
                        .padding(.top, 19)
                        .padding(.bottom, 18)
                        .frame(width: 167, height: 52)
                        .background(Color.black)
                        .cornerRadius(6)
                    }
                }
            } .padding(.top, 150)
    }
}
struct LandingView_Previews: PreviewProvider {
    static var previews: some View {
        LandingView()
    }
}

