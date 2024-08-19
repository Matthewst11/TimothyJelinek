import pandas as pd

# read csv earthquake file
df = pd.read_csv('earthquakes.csv')

# filter earthquake in Japan with magnitude equal to or greater than 4.9
japan_earthquakes = df[(df['parsed_place'] == 'Japan') & (df['mag'] >= 4.9) & (df['magType'] == 'mb')]

print(japan_earthquakes)

# create bins
bins = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
labels = [f'({i}), {i+1}]' for i in range(10)]

# add column with bin labels
df['Magnitude Bin'] = pd.cut(df['mag'], bins=bins, labels=labels)

# count earthquakes in each bin
bin_counts = df['Magnitude Bin'].value_counts()

print(bin_counts)

# read csv faang file
df = pd.read_csv('faang.csv')

# convert the date column to datetime and set as index
df['date'] = pd.to_datetime(df['date'])
df.set_index('date', inplace=True)

# group by ticker and resample by monthly frequency
monthly_aggregations = df.groupby('ticker').resample('M').agg({
    'open': 'mean',
    'high': 'max',
    'low': 'min',
    'close': 'mean',
    'volume': 'sum'
})

print(monthly_aggregations)

# building crosstab with earthquake data between tsunami and magType
earthquake_data = pd.read_csv('earthquakes.csv')
crosstab_result = pd.crosstab(earthquake_data['tsunami'], earthquake_data['magType'], values = earthquake_data['mag'], aggfunc = 'max')

print(crosstab_result)

# calculate 6-=day aggregations of OHLC data by ticker for FAANG
rolling_60_days = monthly_aggregations.groupby('ticker').rolling(window = 60).agg({
    'open': 'mean',
    'high': 'max',
    'low': 'min',
    'close': 'mean',
    'volume': 'sum'
})

print(rolling_60_days)

# create pivot table of FAANG data that compares stocks
pivot_table = df.pivot_table(index='ticker', values=['open', 'high', 'low', 'close', 'volume'], aggfunc='mean')

print(pivot_table)

# filter amzn data for q4 2018
amzn_q4_2018 = df[(df['ticker'] == 'AMZN') & df.index.month.isin([10, 11, 12])]

# calculate z score
numberic_columns = ['open', 'close', 'volume', 'high', 'low']
amzn_q4_2018[numberic_columns] = amzn_q4_2018[numberic_columns].apply(lambda x: (x - x.mean()) / x.std())

print(amzn_q4_2018)

# create FB dataframe
# event_data = pd.DataFrame({
#     'ticker': ['FB'],
#     'date': ['2018-07-25', '2018-03-19', '2018-03-20'],
#     'event': [
#         'Disappointing user growth announced after close.',
#         'Cambridge Analytica story',
#         'FTC investigation'
#     ]
# })

# merge with FAANG using outer join
# merged_data = pd.merge(df, event_data, how='outer', left_index=True, right_index=True)

# print(merged_data)

# def create_index(series):
#     return series / series.iloc[0]

# faang_indexed = df.transform(create_index)

# print(faang_indexed)