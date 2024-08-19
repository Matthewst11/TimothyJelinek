import sqlite3
import pandas as pd

df_football = pd.read_csv('FootBallDataAPI.csv')
df_hall_of_fame = pd.read_csv('HallOfFameFlatFile.csv')
df_html = pd.read_html('JelinekMilestone4.html')

conn = sqlite3.connect('my_database.db')

df_football.to_sql('football_data', conn, if_exists='replace', index=False)
df_hall_of_fame.to_sql('hall_of_fame', conn, if_exists='replace', index=False)
for i, df in enumerate(df_html):
    df.to_sql(f'html_table_{i}', conn, if_exists='replace', index=False)

query = """
SELECT *
FROM football_data
JOIN hall_of_fame ON football_data.player_id = hall_of_fame.player;
"""
cursor = conn.cursor()
cursor.execute(query)
result = cursor.fetchall()



conn.close()
