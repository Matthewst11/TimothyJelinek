import pandas as pd

# read all the csv files
aapl_df=pd.read_csv('aapl.csv')
amzn_df=pd.read_csv('amzn.csv')
fb_df=pd.read_csv('fb.csv')
goog_df=pd.read_csv('goog.csv')
nflx_df=pd.read_csv('nflx.csv')

# add tickers
aapl_df['ticker'] = 'AAPL'
amzn_df['ticker'] = 'AMZN'
fb_df['ticker'] = 'FB'
goog_df['ticker'] = 'GOOG'
nflx_df['ticker'] = 'NFLX'

# combine the dataframes
faang_df = pd.concat([aapl_df, amzn_df, fb_df, goog_df, nflx_df])

# save to faang.csv file
faang_df.to_csv('faang.csv', index=False)