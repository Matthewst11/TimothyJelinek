import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# load earthquake csv
earthquake_df = pd.read_csv('earthquakes.csv')

# filter for mb magnitude 
earthquakes_mb = earthquake_df[earthquake_df['magType'] == 'mb']

# select relevant column
data = earthquakes_mb[['mag', 'tsunami']]

correlation_coefficient = data['mag'].corr(data['tsunami'])

# create heatmap 
plt.figure(figsize=(8, 6))
sns.heatmap(data.corr(), annot=True, cmap='coolwarm', fmt=".2f", vmin=-1, vmax=1)
plt.title('Correlation Heatmap of mag vs tsunami')
plt.show()

# load fb csv
facebook_df = pd.read_csv('fb_stock_prices_2018.csv', parse_dates=['date'])

# calculate q1, a3, and IQR
Q1_volume = facebook_df['volume'].quantile(0.25)
Q3_volume = facebook_df['volume'].quantile(0.75)
IQR_volume = Q3_volume - Q1_volume

Q1_close = facebook_df['close'].quantile(0.25)
Q3_close = facebook_df['close'].quantile(0.75)
IQR_close = Q3_close - Q1_close

# define tukey fence bounds
tukey_fence_multiplier = 1.5
lower_fence_volume = Q1_volume - tukey_fence_multiplier * IQR_volume
upper_fence_volume = Q3_volume + tukey_fence_multiplier * IQR_volume

lower_fence_close = Q1_close - tukey_fence_multiplier * IQR_close
upper_fence_close = Q3_close + tukey_fence_multiplier * IQR_close

# create subplots
fig, (ax1, ax2) = plt.subplots(nrows=1, ncols=2, figsize=(12, 6))

# plot close price boxplot with tukey fences
sns.boxplot(x=facebook_df['volume'], ax=ax1)
ax1.axvline(lower_fence_volume, color='r', linestyle='--', label='Lower Tukey Fence')
ax1.axvline(upper_fence_volume, color='r', linestyle='--', label='Upper Tukey Fence')
ax1.set_title('Volume Traded')
ax1.legend()

# plot close price boxplot with Tukey fences
sns.boxplot(x=facebook_df['close'], ax=ax2)
ax2.axvline(lower_fence_close, color='r', linestyle='--', label='Lower Tukey Fence')
ax2.axvline(upper_fence_close, color='r', linestyle='--', label='Upper Tukey Fence')
ax2.set_title('Closing Prices')
ax2.legend()

#adjusting layout and display
plt.tight_layout()
plt.show()

# read csv
covid_19_df = pd.read_csv('covid19_cases.csv', parse_dates=['dateRep'])

# filter and aggregate worldwide cumulative cases
covid_19_df_world = covid_19_df.groupby('dateRep')['cases'].sum().cumsum().reset_index()

# find date where cumualative cases are passed 1mil
date_surpassed_1m_cases = covid_19_df_world[covid_19_df_world['cases'] > 10000000]['dateRep'].min()

# plotting
plt.figure(figsize=(10, 6))
plt.plot(covid_19_df_world['dateRep'], covid_19_df_world['cases'], marker='o', linestyle='-', color='b', label='Cumulative Cases')
plt.axvline(date_surpassed_1m_cases, color='r', linestyle='--', label='Surpassed 1million Cases')

# format y axis tick labels
plt.gca().get_yaxis().set_major_formatter(plt.FuncFormatter(lambda x, loc:"{:,}".format(int(x))))
                                          
# add labels and title
plt.xlabel('Date')
plt.ylabel('Cumulative Covid-19 Cases')
plt.title('Evolution of Cumulative Covid-19 Cases Worldwide')
plt.legend()

# rotate x axis labels for readability
plt.xticks(rotation=45)

# display plot
plt.tight_layout()
plt.show()

# filter and sort FB by date
facebook_df = facebook_df.sort_values('date')

# define date range for shading
start_date = '2018-07-25'
end_date = '2018-07-31'

# plotting
plt.figure(figsize=(10, 6))
plt.plot(facebook_df['date'], facebook_df['close'], marker='o', linestyle='-', color='b', label='Closing Price')

# add labels and title 
plt.xlabel('Date')
plt.ylabel('Closing Price')
plt.title('Facebook Closing Price with Shaded Decline Period')
plt.legend()

# rotate x axis labels for better readability
plt.xticks(rotation=45)

# display plot
plt.tight_layout()
plt.show()

# sort by date
facebook_df = facebook_df.sort_values('date')

# plot
plt.figure(figsize=(12, 6))
plt.plot(facebook_df['date'], facebook_df['close'], marker='o', linestyle='-', color='b', label='Closing Price')

# disappointing user growth announced after close on July 25, 2018
plt.annotate('Disappointing user growth\nannounced (July 25, 2018)',
    xy=(pd.Timestamp('2018-07-25'), facebook_df[facebook_df['date'] == '2018-07-25']['close'].values[0]),
    xytext=(pd.Timestamp('2018-07-27'), facebook_df['close'].min()),
    arrowprops=dict(facecolor='black', arrowstyle='->'),
    fontsize=10, ha='center')

# cambridge analytica story breaks on March 19, 2018
plt.annotate('Cambridge Analytica story breaks\n(March 19, 2018)',
    xy=(pd.Timestamp('2018-03-19'), facebook_df[facebook_df['date'] == '2018-03-19']['close'].values[0]),
    xytext=(pd.Timestamp('2018-03-21'), facebook_df['close'].max()),
    arrowprops=dict(facecolor='black', arrowstyle='->'),
    fontsize=10, ha='center')

# FTC launches investigation on March 20, 2018

plt.annotate('FTC launches investigation\n(March 20, 2018)',
    xy=(pd.Timestamp('2018-03-20'), facebook_df[facebook_df['date'] == '2018-03-20']['close'].values[0]),
    xytext=(pd.Timestamp('2018-03-22'), facebook_df['close'].max()),
    arrowprops=dict(facecolor='black', arrowstyle='->'),
    fontsize=10, ha='center')

# labels and title
plt.xlabel('Date')
plt.ylabel('Closing Price')
plt.title('Facebook Closing Price with Key Events Annotations')
plt.legend()

# rotate x axis labels for better readability
plt.xticks(rotation=45)

# display plot
plt.tight_layout()
plt.show()

def reg_resid_plots(x, y, model):
    """
    generate regression plots
    """

    # calculate residuals
    residuals = y - model.predict(x)

    # generate figure with subplots
    fig, (ax1, ax2) = plt.subplots(nrows=1, ncols=2, figsize=(12, 6))

    # define colormap
    cmap = plt.cm.get_cmap('Set1')

    # plot residuals vs fitted values
    ax1.scatter(model.predict(x), residuals, c=residuals, alpha=0.6)
    ax1.axhline(0, color='black', linestyle='--', linewidth=1)
    ax1.set_xlabel('Fitted values')
    ax1.set_ylabel('Residuals')
    ax1.set_title('Residuals vs Fitted Values')

    # plot QQ plot of residuals
    from scipy import stats
    stats.probplot(residuals, dist="norm", plot=ax2)
    ax2.set_title('QQ Plot of Residuals')

    # adjust layout and show plot
    plt.tight_layout()
    plt.show()
