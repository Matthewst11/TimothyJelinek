import requests
from bs4 import BeautifulSoup
import pandas as pd

# scrapes the website
url = 'https://nflcombineresults.com/nflcombinedata.php'
response = requests.get(url)
soup = BeautifulSoup(response.content, 'html.parser')

# extracts the table body
table_body = soup.find('tbody')

# extracts data from the table body
rows = []
for tr in table_body.find_all('tr'):
    cells = [td.get_text().strip() for td in tr.find_all('td')]
    if cells:  # avoid empty rows
        rows.append(cells)

# converts rows to dataframe for processing
headers = ['Year', 'Name', 'College', 'Pos', 'Height (in)', 'Weight (lbs)', 'Wonderlic', '40 Yard', 'Bench Press', 'Vert Leap (in)', 'Broad Jump (in)', 'Shuttle', '3Cone']
df = pd.DataFrame(rows, columns=headers)

# identify duplicate rows in all columns
duplicates = df[df.duplicated(keep='first')]

# create new row
new_row1 = {
    'Year': '2020',
    'Name': 'Bob Stewart',
    'College': 'Bellevue University',
    'Pos': 'RB',
    'Height (in)': '80',
    'Weight (lbs)': '190',
    'Wonderlic': '',
    '40 Yard': '2.0',
    'Bench Press': '18',
    'Vert Leap (in)': '25',
    'Broad Jump (in)': '110',
    'Shuttle': '4.7',
    '3Cone': '6.7'
}

# convert row to dataframe
new_row_df1 = pd.DataFrame([new_row1], columns=df.columns)

# add element using concat
df = pd.concat([df, new_row_df1], ignore_index=True)

# create new row
new_row2 = {
    'Year': '1998',
    'Name': 'Matthew Cowards',
    'College': 'Cowards College',
    'Pos': 'CB',
    'Height (in)': '70',
    'Weight (lbs)': '170',
    'Wonderlic': '20',
    '40 Yard': '4.5',
    'Bench Press': '15',
    'Vert Leap (in)': '25',
    'Broad Jump (in)': '100',
    'Shuttle': '4.8',
    '3Cone': '7.5'
}

# convert new row to data frame
new_row_df2 = pd.DataFrame([new_row2], columns=df.columns)

# add element using concat
df = pd.concat([df, new_row_df2], ignore_index=True)

# create new row
new_row3 = {
    'Year': '2024',
    'Name': 'John Doe',
    'College': 'Sample College',
    'Pos': 'QB',
    'Height (in)': '75',
    'Weight (lbs)': '230',
    'Wonderlic': '25',
    '40 Yard': '4.8',
    'Bench Press': '20',
    'Vert Leap (in)': '32',
    'Broad Jump (in)': '120',
    'Shuttle': '4.2',
    '3Cone': '7.0'
}

# convert the new row to dataframe
new_row_df3 = pd.DataFrame([new_row3], columns=df.columns)

# add element using concat
df = pd.concat([df, new_row_df3], ignore_index=True)

# clean the dataframe
df = df.applymap(lambda x: x.strip().lower())  # converts to lowercase and strips whitespace

# makes sure there is no NaN values in the dataframe
df.dropna(inplace=True)

# clear existing tbody
table_body.clear()

# add modified rows to the tbody
for index, row in df.iterrows():
    tr = soup.new_tag('tr')
    for value in row:
        td = soup.new_tag('td')
        td.string = value
        tr.append(td)
    table_body.append(tr)

# save updated HTML to HTML file
with open('JelinekMilestone4.html', 'w', encoding='utf-8') as file:
    file.write(str(soup))