import pandas as pd
import csv

# read csv
df = pd.read_csv('FootBallDataAPI.csv')

# empty the irrelevant data
df.drop(df.index, inplace=True)

# change columns
new_column_names = ['player_name', 'position', 'stats', 'team', 'hall_of_fame_class', 'seasons']

# create an empty DataFrame with specified columns
df = pd.DataFrame(columns=new_column_names)

# add Hall of Fame Heisman Winner Stats
player_data = [ 
    ['OJ Simpson', 'RB', 'Rushing Yards: 11236, Receiving Yards: 2142, Touchdowns: 76', 'Buffalo Bills, 49ers', '1985', '11'],
    ['Roger Staubach', 'QB', 'Passing Yards: 22700, Rushing TDs: 20, Rushing Yards: 2264, Touchdown Passes: 153', 'Dallas Cowboys', '1986', '11'],
    ['Paul Hornung', 'RB', 'Rushing Yards: 3711, Receiving Yards: 1480, Touchdowns: 62', 'Green Bay Packers', '1986', '9'],
    ['Doak Walker', 'RB', 'Rushing Yards: 1520, Receiving Yards: 2539, Touchdowns: 33', 'Detroit Lions', '1986', '6'],
    ['Earl Campbell', 'RB', 'Rushing Yards: 9407, Receiving Yards: 806, Touchdowns: 74', 'Houston Oilers, New Orleans Saints', '1991', '8'],
    ['Tony Dorsett', 'RB', 'Rushing Yards: 12739, Receiving Yards: 3554, Touchdowns: 90', 'Dallas Cowboys, Denver Broncos', '1994', '12'],
    ['Marcus Allen', 'RB', 'Rushing Yards: 12243, Receiving Yards: 5411, Touchdowns: 188', 'Los Angeles Raiders, Kansas City Chiefs', '2003', '16'],
    ['Barry Sanders', 'RB', 'Rushing Yards: 15269, Receiving Yards: 2921, Touchdowns: 140', 'Detroit Lions', '2004', '10'],
    ['Tim Brown', 'WR', 'Receiving Yards: 14934, Touchdowns: 100', 'Los Angeles Raiders, Oakland Raiders, Tampa Bay Buccaneers', '2015', '17'],
    ['Charles Woodson', 'CB/S', 'Interceptions: 65, Touchdowns: 11', 'Oakland Raiders, Green Bay Packers', '2021', '18']
]

# write data to csv file
with open("FootBallDataAPI.csv", "w", newline="") as csvfile:
    writer=csv.writer(csvfile)
    writer.writerows(player_data)

# add player
new_player_data = [
    [
        'Ricky Williams', 
        'RB',
        'Rushing Yards: 10009, Receiving Yards: 2606, Touchdowns: 74',
        'New Orleans Saints, Miami Dolphins, Baltimore Ravens', 
        '2015', 
        '12'
]
]

# format data and parse stats column into individual stats
df['Rushing_Yards'] = df['stats'].str.extract(r'Rushing Yards: (\d+)').astype(float)
df['Receiving_Yards'] = df['stats'].str.extract(r'Receiving Yards: (\d+)').astype(float)
df['Touchdowns'] = df['stats'].str.extract(r'Touchdowns: (\d+)').astype(int)

# fix casing and inconsistent values
df['team'] = df['team'].str.replace('Buffalo Bills, 49ers', 'Buffalo Bills, San Francisco 49ers')

# remove duplicates 
df.drop_duplicates(inplace=True)

# append player_data to the DataFrame
df = (pd.DataFrame(player_data, columns=new_column_names))

# append new_player_data to DataFrame
df = pd.concat([df, pd.DataFrame(new_player_data, columns=new_column_names)], ignore_index=True)

df.to_csv('FootBallDataAPI.csv', index=False)