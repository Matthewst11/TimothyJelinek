import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

# read csv file
df = pd.read_csv('fb_stock_prices_2018.csv')

# calculate rolling 20-day minimum
df['Rolling_Min'] = df['close'].rolling(window=20).min()

# plot rolling min
plt.plot(df['date'], df['Rolling_Min'], label='Rolling 20 day min')
plt.xlabel('Date')
plt.ylabel('Price')
plt.title('Facebook Stock Rolling 20 day Min')
plt.legend()
plt.show()

# calculate daily price change
df['Price_Change'] = df['close'] - df['open']

# create histogram and KDE
sns.histplot(df['Price_Change'], kde=True)
plt.xlabel('Price Change')
plt.ylabel('Frequency')
plt.title('Price Change of Facebook Stock')
plt.show()

df_eq = pd.read_csv('earthquakes.csv')

# filter earthquakes for Indonesia
indonesia_data = df_eq[df_eq['parsed_place'] == 'Indonesia']

# create box plots
sns.boxplot(x='magType', y='mag', data=indonesia_data)
plt.xlabel('Magnitude Type')
plt.ylabel('Magnitude')
plt.title('Earthquake Magnitudes in Indonesia')
plt.show()

df['Weekly_Difference'] = df['high'] - df['low']

# plot weekly difference
plt.plot(df['date'], df['Weekly_Difference'], label="Weekly Difference")
plt.xlabel('Date')
plt.ylabel('Price Difference')
plt.title('Weekly Price Difference of Facebook Stock')
plt.show()

# calculate daily difference
df['Daily_Difference'] = df['open'] - df['close'].shift(1)

# create line plot
plt.figure(figsize=(10, 5))
plt.subplot(1, 2, 1)
plt.plot(df['date'], df['Daily_Difference'], color='b')
plt.xlabel('Date')
plt.ylabel('Daily Difference')
plt.title('Daily Difference Between Opening Today and Closing Yesterday')
plt.show()

# convert date column to datetime
df['date'] = pd.to_datetime(df['date'])

# set datetime index
df.set_index('date', inplace=True)

# resample data for monthly frequency and calculate mean
monthly_mean = df['Daily_Difference'].resample('M').mean()

# create bar plot
plt.figure(figsize=(10, 5))
plt.subplot(1, 2, 2)
colors = ['g' if diff >= 0 else 'r' for diff in monthly_mean]
plt.bar(monthly_mean.index, monthly_mean, color='g')
plt.xlabel('Month')
plt.ylabel('Monthly Mean Difference')
plt.title('Monthly Net Effect of After Hours Trading')

# set x axis labels for three letter months
plt.xticks(monthly_mean.index, [month.strftime('%b') for month in monthly_mean.index])

plt.tight_layout()
plt.show()

