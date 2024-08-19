import csv
import pandas as pd

# define data 
data = [
    ["Player", "Hall of Fame Class", "College", "All-Pro Selections", "Seasons"],
    ["O.J. Simpson", 1985, "university of Southern California", 5, 11],
    ["Roger Staubach", 1985, "Navy", "N/A", 11],
    ["Paul Hornung", 1986, "University of Notre Dame", "N/A", 9],
    ["Doak Walker", 1986, "Southern Methodist University", 5, 6],
    ["Earl Campbell", 1991, "University of Texas", "N/A", 8],
    ["Tony Dorsett", 1994, "University of Pittsburgh", "N/A", 12],
    ["Marcus Allen", 2003, "University of Southern California", "N/A", 16],
    ["Barry Sanders", 2004, "Oklahoma State University", "N/A", 10],
    ["Tim Brown", 2015, "University of Notre Dame", "N/A", 17],
    ["Charles Woodson", 2021, "University of Michigan", "N/A", 18]
]

# write data to csv file
with open("HallOfFameFlatFile.csv", "w", newline="") as csvfile:
    writer=csv.writer(csvfile)
    writer.writerows(data)

print("CSV file created successfully HallOfFameFlatFile.csv.")

df = pd.DataFrame(data[1:], columns=data[0])

# reformat headers
df.columns = [column.replace(" ", "_").lower() for column in df.columns]

# replace data to readable format
df.replace("N/A", pd.NA, inplace=True)

# find duplicates and bad data
threshold = 0 
duplicates = df.duplicated()
bad_data = (df.isna().sum(axis=1) > threshold)

# fix casinng
df['college'] = df['college'].str.title()

# add player
new_row = {'Player': 'Ricky Williams', 'Hall of Fame Class': 2015, 'College': 'University of Texas', 'All-Pro Selections': "N/A", 'Seasons': 12}
df = pd.concat([df, pd.DataFrame([new_row])], ignore_index=True)

df.to_csv("HallOfFameFlatFile.csv", sep="\t", index=False)