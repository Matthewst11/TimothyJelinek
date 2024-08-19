import pandas as pd

# read csv file
faang_df = pd.read_csv('faang.csv')

# convert data column to datetime
faang_df['date'] = pd.to_datetime(faang_df['date'])

# convert volume column to integers
faang_df['volume'] = faang_df['volume'].astype(int)

# sort by date and ticker
faang_df.sort_values(by=['date', 'ticker'], inplace=True)

# find rows with lowest volume
lowest_volume_rows = faang_df.nsmallest(7, 'volume')
print(lowest_volume_rows)

# melt dataframe to long format
faang_long_df = pd.melt(faang_df, id_vars=['date', 'ticker'], value_vars=['open', 'high', 'low', 'close', 'volume'], var_name='variable', value_name='value')
print(faang_df.head)