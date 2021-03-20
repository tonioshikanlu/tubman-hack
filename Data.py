import alpaca_trade_api as tradeapi
import requests
import pandas as pd
from consts import *
from sample_config import *

###### SETUP ALPACA API #########


TIMEZONE = 'America/New_York'

BASE_URL = "https://paper-api.alpaca.markets"   
DATA_URL = "https://data.alpaca.markets/v1"   

#gotten from hypothetical user DB. currently importing single user from sample config for simplicity
req_headers = {
    "APCA-API-KEY-ID":API_KEY, 
    "APCA-API-SECRET-KEY":SECRET_KEY
}

ACCOUNT_URL = "{}/v2/account".format(BASE_URL)

# print(account.buying_power)
# print(api.list_positions())


# Dataframe representing Stock info
# Acessed like so
# stock_df[stock_ticker, field]
# for field in [open, high, low, close, volume]


# Quick guide to using a Dataframe:
# https://www.geeksforgeeks.org/how-to-get-column-names-in-pandas-dataframe/
# https://www.tutorialspoint.com/python_pandas/python_pandas_dataframe.htm
# Pandas documentation for DataFrames
# https://pandas.pydata.org/pandas-docs/stable/reference/api/pandas.DataFrame.html


#Functions
# get_historical_data -  Take in a list of objects, and get historical data - , return the BLOB for each item in the list
# get_current_price
# submit an order
# submit a limit order
 

class TradeRipper:
    '''
    This class represents an instance of the TradeRipper stock trading bot.
    '''
    def __init__(self, stocks_to_watch):
        self.stocks_to_watch = stocks_to_watch
        self.api = tradeapi.REST(API_KEY, SECRET_KEY, base_url=BASE_URL) # or use ENV Vars shown below
        self.data = {}
    
    def get_top_movers(self):
        #return a list of stocks with highest percentage move. 
        # 5 movers up, 2 movers down
        pass


    def get_historical_data(self, stock_list):
        # Returns a dataframe
        # Dataframe representing Stock info
        # Acessed like so
        # stock_df[stock_ticker, field]
        # for field in [open, high, low, close, volume]
        
        delta = pd.Timedelta(value=MAX_HISTORY, unit='days')
        end = pd.Timestamp.now(tz=TIMEZONE)
        start = (end - delta).isoformat()
        end.isoformat()
        stock_df = self.api.get_barset(stock_list, HISTORY_RANGE, start=start, end=end).df
        return stock_df
    
    def get_all_stocks(self):
        '''
        Attributes are:
        "id": "904837e3-3b76-47ec-b432-046db621571b",
        "class": "us_equity",
        "exchange": "NASDAQ",
        "symbol": "AAPL",
        "status": "active",
        "tradable": true,
        "marginable": true,
        "shortable": true,
        "easy_to_borrow": true
        '''
        # should return an object with all the stocks currently available. 
        # each stock usually has all the information with it. 
        # please include in the comments, the attributes associated to each stock, 
        # so i can know how to work with it
        all_stocks = self.api.list_assets(status= "active")
        return all_stocks
    
    def filter_all_stocks_limit(self, price_limit):
        # should filter all stocks from get_all_stocks by price limit. Hence
        # should return an object of all stocks with prices greater than the 
        # limit
        stocks = self.get_all_stocks() 
        stocks_limit = []

        for i in stocks:
            print(i.symbol)
            price = self.get_current_price(i.symbol)
            if price != None:
                if price > price_limit:
                    stocks_limit.append(i)
        return stocks_limit

    
    def filter_all_stocks_range(self, start_price, end_price):
         # should filter all stocks from get_all_stocks by price limit. Hence
        # should return an object of all stocks with prices within the price range
        pass


    def get_stocks_to_watch(self):
        return self.stocks_to_watch

    def get_current_price(self, stock):
        current_stock = self.api.get_barset(stock, CURRENT_STOCK_RANGE).df
        if len(current_stock) != 0:
            return current_stock[stock].close[-1]
        else:
            return None

    def buy_stock(self, stock, qty):
        current_stock = self.api.submit_order(stock, qty, "buy", "market", "gtc")
        # add the current price the stock was bought for to the print statemnt if true
        if current_stock.status == "accepted":
            print("Success, bought at", self.get_current_price(stock))
        else:
            print("failed to buy stock")
        return current_stock
    
    def sell_stock(self, stock, qty):
        current_stock = self.api.submit_order(stock, qty, "sell", "market", "gtc")
        if current_stock.status == "accepted":
            print("Success, sold at", self.get_current_price(stock))
        else:
            print("failed to sell stock")
        return current_stock

    def buy_limit_stock(self, stock, qty, limit):
        current_stock = self.api.submit_order(stock, qty, "buy", "limit", "gtc", limit)
        if current_stock.status == "accepted":
            print("Limit order received at", self.get_current_price(stock), "Limit price is", limit)
        else:
             print("failed to buy stock")
        return current_stock

    def list_orders(self):
        return self.api.list_orders()
    
    def cancel_order(self, order_id):
        order_status = self.api.cancel_order(order_id)
        if order_status == True:
            print("Order cancelled!")
        else:
            print("Order failed")

    def sell_limit_stock(self, stock, qty, limit):
        current_stock = self.api.submit_order(stock, qty, "sell", "limit", "gtc", limit)
        if current_stock.status == "accepted":
            print("Limit order received at", self.get_current_price(stock), "Limit price is", limit)
            if limit<self.get_current_price(stock):
                print('Sold')
            else:
                print('Not yet sold')
        else:
             print("failed to sell stock")
        return current_stock
    
    def sell_limit_marginal(self, stock, qty, margin):
        current_stock = self.api.submit_order(stock, qty, "sell", "trailing_stop", "gtc", trail_percent=margin)
        if current_stock.status == "new":
            print("Marginal order received at", self.get_current_price(stock), "Trailing percent is", margin)
        else:
             print("failed to sell stock")
        return current_stock

    def get_buying_power(self):
        return self.api.get_account().buying_power
    
    def get_current_portfolio(self):
        return self.api.list_positions()

    def get_all_owned_stocks(self):
        # Should return a list of all owned stocks
        # a way to solve this would be to check the documentation (check config file for links) - Look at Positions.
        # call the API, and print what it returns 
        # then loop through all the objects in portfolio and add the stocks found into a list
        # then return the list
        # each list shouldn't have duplicates
        owned_stocks = []
        position_entities = self.api.list_positions()

        for i in position_entities:
            owned_stocks.append(i.symbol)
        
        return owned_stocks
    
    def get_all_owned_stocks_with_price(self):
        
        all_owned_stocks_with_price = {}
        owned_stocks_list = self.api.list_positions() # get the positions i.e a list of all stocks
        total = 0

        for stock in owned_stocks_list:
            # calculating total worth for each stock
            total_worth_per_stock = int(stock.qty)*float(stock.current_price)
            # assigning the symbol property of a position to the total worth per stock
            all_owned_stocks_with_price[stock.symbol] = total_worth_per_stock
            # calculating the total equity
            total = total + total_worth_per_stock
       
       # assigning total equity key to the total money in the dictionary
        all_owned_stocks_with_price['total']=total
        return all_owned_stocks_with_price

    
delta = pd.Timedelta(value=MAX_HISTORY, unit='days')

Tr = TradeRipper(STOCKS)

###### Get Market DatA ######
# Should be imported

ALL_STOCKS = Tr.get_all_stocks()
Tr.get_historical_data(ALL_STOCKS)

