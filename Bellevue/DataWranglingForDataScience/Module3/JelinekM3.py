import pandas as pd
import quandl
import numpy as np

# load dataset
df = pd.read_csv('parsed.csv')

# filter data for Japan using mb magType
japan_data = df[(df['parsed_place'] == 'Japan') & (df['magType'] == 'mb')]

# calculate the 95th percentile 
percentile_95 = japan_data['mag'].quantile(0.95)
print("95th percentile of earthquake magnitude in Japan:", japan_data)

# filter data for Indonesia and tsunamis
indonesia_data = df[df['parsed_place'] == 'Indonesia']
tsunami_count = indonesia_data['tsunami'].sum()
total_earthquakes = len(indonesia_data)

# calculate percentage
percentage_tsunami = (tsunami_count / total_earthquakes) * 100
print("Percentage of earthquakes in Indonesia that were coupled with tsunamis: ", percentage_tsunami)

# filter data for Nevada
nevada_data = df[df['parsed_place'] == 'Nevada']

# summary stats for Nevada
summary_stats = nevada_data['mag'].describe()
print("Summary stats for earthquakes in Nevada: ")
print(summary_stats)

# create list of Ring of Fire locations
ring_of_fire_locations = ['Alaska', 'Antarctica', 'Bolivia', 'California', 'Canada', 'Chile', 'Costa Rica', 'Ecuador', 'Fiji', 'Guatemala', 'Indonesia', 'Japan', 'Kermadec Islands', 'Mexico', 'New Zealand', 'Peru', 'Philippines', 'Russia', 'Taiwan', 'Tonga', 'Washington']

# add new column for 'RingOfFire' with boolean values
df['RingOfFire'] = df['parsed_place'].apply(lambda x: any(loc in x for loc in ring_of_fire_locations))

# display updated DataFrame
print(df[['parsed_place', 'RingOfFire']])

# # calculate earthquakes in Ring of Fire
ring_of_fire_earthquakes = df[df['RingOfFire']].shape[0]

# count earthquakes outside of Ring of Fire
non_ring_of_fire_earthquakes = df[~df['RingOfFire']].shape[0]

print("Earthquakes in the Ring of Fire: ", ring_of_fire_earthquakes)
print("Earthquakes outside of the Ring of Fire: ", non_ring_of_fire_earthquakes)

# filter data for Ring of Fire Location
ring_of_fire_data = df[df['RingOfFire']]

# count tsunamis 
tsunami_count_ring_of_fire = ring_of_fire_data['tsunami'].sum()

print("Tsunami count along the ring of fire: ", tsunami_count_ring_of_fire)

# read the next file
df = pd.read_csv("WHO_first9cols.csv")

# print dataframe
print(df)

num_rows = df.shape[0]
print("Number of rows: ", num_rows)

print("Column headers: ")
print(df.columns)

print("Data types: ")
print(df.dtypes)

print("Index: ")
print(df.index)

country_column = df["Country"]
print("Data type: ", country_column.dtype)
print("Series shape: ", country_column.shape)
print("Index: ", country_column.index)
print("Values: ", country_column.values)
print("Name: ", country_column.name)

# setting Quand1 API key
quandl.ApiConfig.api_key = "-qudR6k7PcyGcTkXGnF3"

# get historical stock prices of Tesla
tesla_data = quandl.get("WIKI/TSLA")

print("Head: ")
print(tesla_data.head())

print("\nTail: ")
print(tesla_data.tail())

last_value = tesla_data.iloc[-1]
print("Last value: ", last_value)

specific_date = tesla_data.loc["20180327"]
print("Data for June 1st, 2023: ", specific_date)

# mean_observations = tesla_data["Adj. Close"].mean()
# filtered_data = tesla_data[tesla_data["Adj. Close"]] - mean_observations
# print("Observations > mean: ", filtered_data)

#
#
#
#
#

# sunspots_data = tesla_data["Sunspots"].dropna()

# print("Descriptive Stats for Sunspots: ", sunspots_data.describe())
# print("Count of obervations: ", sunspots_data.count)
# print("Mean Absolute Observation: ", sunspots_data.mad)
# print("Mean: ", sunspots_data.mean())
# print("Median: ", sunspots_data.median())
# print("Max: ", sunspots_data.max())
# print("Min: ", sunspots_data.min())
# print("Mode: ", sunspots_data.mode())
# print("Standard deviation: ", sunspots_data.std())
# print("Variance: ", sunspots_data.var())
# print("Skewness: ", sunspots_data.skew())

# create dataframe with random data
data = np.random.randint(0, 100, size=(10, 3))
columns = ['Weather', 'Food Price', 'Number']
df = pd.DataFrame(data, columns=columns)

weather_group = df.groupby('Weather')

# first row
first_row = weather_group.first()

# last row
last_row = weather_group.last()

# mean for each group
mean_per_group = weather_group.mean()

food_group = df.groupby(['Weather', 'Food Price'])

agg_results = food_group.agg({'Number': ['mean', 'median'], 'Food Price': ['mean', 'median']})

selected_rows = df.head(3)

concatenated_df = pd.concat([selected_rows, df])

# appended_df = concatenated_df.append(df.tail(2))

print("First Row for Each Group: ", first_row)
print("Last Row for Each Group: ", last_row)
print("Mean for Each Group: ", mean_per_group)
print("Aggregated Results: ", agg_results)
print("Selected rows : ", selected_rows)
print("Concatenated DataFrame: ", concatenated_df)

# read the csv files
dest_df = pd.read_csv("dest.csv")
tips_df = pd.read_csv("tips.csv")

# merge based on EmpNr
merged_df = pd.merge(dest_df, tips_df, on="EmpNr", suffixes=("_dest", "_tips"))

# print the merged dataframe
print(merged_df)

# # join on the index
# joined_df = dest_df.join(tips_df)

# # print joined dataframe
# print(joined_df)

# read first three rows of WHO_first9cols.csv
who_df = pd.read_csv("WHO_first9cols.csv", nrows=3)
print(who_df)

# check for missing values
missing_values = who_df.isnull().sum()

# count number of NaN values
num_nan_values = missing_values.sum()

# print non-missing values
non_missing_values = who_df.dropna()
print(non_missing_values)

# replace NaN values with a scalar
who_df.fillna(0, inplace = True)