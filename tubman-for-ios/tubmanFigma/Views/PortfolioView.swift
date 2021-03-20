//
//  PortfolioView.swift
//  tubmanFigma
//
//  Created by Tamaraupreye Benni on 3/20/21.
//

import Foundation
import SwiftUI

struct PortfolioView: View {
    var body: some View {
        VStack (alignment: .leading, spacing: 10) {
            
            Spacer()
            Text("Portfolio")
                .bold()
                .font(.system(size: 36))
                .padding(.leading, 5.0)
                .cornerRadius(6)
            
            
            Text("$ 3,745.89")
                .bold()
                .font(.system(size: 36))
                .padding(.leading, 5.0)
                .cornerRadius(6)
            
            Spacer()
            
            Image("stock_chart")
                .resizable()
                .aspectRatio(contentMode: .fill)
                .padding(.leading, 5.0)
                .frame(width: 400.0, height: 150, alignment: .center)
            
            Spacer()
            
            Text("1DAY   1WEEK    1MONTH     3MONTHS")
                .bold()
                .font(.system(size: 13))
                .cornerRadius(6)
            
            List () {
                VStack (alignment: .leading) {
                    Spacer()
                    HStack () {
                        VStack (alignment: .leading) {
                            Text("APPL")
                                .bold()
                                .font(.system(size: 24))
                                .cornerRadius(6)
                            Text("Apple")
                                .font(.system(size: 18))
                                .cornerRadius(6)
                        }
                        Spacer()
                        Color.green
                            .frame(width: 80, height: 40)
                            .cornerRadius(6)
                            .overlay(
                                VStack (alignment: .trailing) {
                                    Text("+0.54%")
                                        .foregroundColor(Color.white)
                                        .font(.system(size: 18))
                                        .cornerRadius(6)
                                })
                    }
                    Spacer()
                }.frame(height: 50)
                
                VStack (alignment: .leading) {
                    Spacer()
                    HStack () {
                        VStack (alignment: .leading) {
                            Text("GOOGL")
                                .bold()
                                .font(.system(size: 24))
                                .cornerRadius(6)
                            Text("Google")
                                .font(.system(size: 18))
                                .cornerRadius(6)
                        }
                        Spacer()
                        Color.red
                            .frame(width: 80, height: 40)
                            .cornerRadius(6)
                            .overlay(
                                VStack (alignment: .trailing) {
                                    Text("-8.76%")
                                        .foregroundColor(Color.white)
                                        .font(.system(size: 18))
                                        .cornerRadius(6)
                                })
                    }
                    
                    Spacer()
                }.frame(height: 50)

                
                VStack (alignment: .leading) {
                    Spacer()
                    
                    HStack () {
                        VStack (alignment: .leading) {
                            Text("AMZN")
                                .bold()
                                .font(.system(size: 24))
                                .cornerRadius(6)
                            Text("Amazon")
                                .font(.system(size: 18))
                                .cornerRadius(6)
                        }
                        Spacer()
                        Color.green
                            .frame(width: 80, height: 40)
                            .cornerRadius(6)
                            .overlay(
                                VStack (alignment: .trailing) {
                                    Text("+10.23%")
                                        .foregroundColor(Color.white)
                                        .font(.system(size: 18))
                                        .cornerRadius(6)
                                })
                    }
                    Spacer()
                }.frame(height: 50)

                
                VStack (alignment: .leading) {
                    Spacer()
                    HStack () {
                        VStack (alignment: .leading) {
                            Text("PFE")
                                .bold()
                                .font(.system(size: 24))
                                .cornerRadius(6)
                            Text("Pfizer")
                                .font(.system(size: 18))
                                .cornerRadius(6)
                        }
                        Spacer()
                        Color.green
                            .frame(width: 80, height: 40)
                            .cornerRadius(6)
                            .overlay(
                                VStack (alignment: .trailing) {
                                    Text("+12.11%")
                                        .foregroundColor(Color.white)
                                        .font(.system(size: 18))
                                        .cornerRadius(6)
                                })
                    }
                    Spacer()
                }.frame(height: 50)
                
                
                VStack (alignment: .leading) {
                    Spacer()
                    HStack () {
                        VStack (alignment: .leading) {
                            Text("MRNA")
                                .bold()
                                .font(.system(size: 24))
                                .cornerRadius(6)
                            Text("Moderna")
                                .font(.system(size: 18))
                                .cornerRadius(6)
                        }
                        Spacer()
                        Color.red
                            .frame(width: 80, height: 40)
                            .cornerRadius(6)
                            .overlay(
                                VStack (alignment: .trailing) {
                                    Text("-5.97%")
                                        .foregroundColor(Color.white)
                                        .font(.system(size: 18))
                                        .cornerRadius(6)
                                })
                    }
                    Spacer()
                }.frame(height: 50)
                
                
                VStack (alignment: .leading) {
                    Spacer()
                    HStack () {
                        VStack (alignment: .leading) {
                            Text("UAL")
                                .bold()
                                .font(.system(size: 24))
                                .cornerRadius(6)
                            Text("United Airlines")
                                .font(.system(size: 18))
                                .cornerRadius(6)
                        }
                        Spacer()
                        Color.red
                            .frame(width: 80, height: 40)
                            .cornerRadius(6)
                            .overlay(
                                VStack (alignment: .trailing) {
                                    Text("-1.23%")
                                        .foregroundColor(Color.white)
                                        .font(.system(size: 18))
                                        .cornerRadius(6)
                                })
                    }
                    Spacer()
                }.frame(height: 50)
                
                
                VStack (alignment: .leading) {
                    Spacer()
                    HStack () {
                        VStack (alignment: .leading) {
                            Text("DAL")
                                .bold()
                                .font(.system(size: 24))
                                .cornerRadius(6)
                            Text("Delta Airlines")
                                .font(.system(size: 18))
                                .cornerRadius(6)
                        }
                        Spacer()
                        Color.red
                            .frame(width: 80, height: 40)
                            .cornerRadius(6)
                            .overlay(
                                VStack (alignment: .trailing) {
                                    Text("-10.97%")
                                        .foregroundColor(Color.white)
                                        .font(.system(size: 18))
                                        .cornerRadius(6)
                                })
                    }
                    Spacer()
                }.frame(height: 50)

            }
        }.padding(.leading, 10.0)
    }
}

struct PortfolioView_Previews: PreviewProvider {
    static var previews: some View {
        PortfolioView()
    }
}
