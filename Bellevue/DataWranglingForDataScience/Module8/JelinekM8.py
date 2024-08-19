import numpy as np
import pandas as pd
import os
import json

# generating a 3x4 numpy array with seeding random generator
np.random.seed(0)
array_3x4 = np.random.rand(3, 4)
print("3x4 Array:\n", array_3x4)

# save array as csv np.csv
np.savetxt("np.csv", array_3x4, delimiter=",")

# can view np.csv file with cat np.csv in terminal

# create datafram from file and print results
df = pd.read_csv("np.csv", header=None)
print("DataFrame from np.csv:\n", df)

# write dataframe to CSV file
df.to_csv("dataframe.csv", index=False)

# generate 365x4 numpy array with random numbers
array_365x4 = np.random.rand(365, 4)
print("365x4 Array:\n", array_365x4)

# store array in csv file
np.savetxt("array_365x4.csv", array_365x4, delimiter=(","))
print("Size of array_365x4.csv", os.path.getsize("array_365x4.csv"), "bytes")

# save array in numpy format
np.save("array_365x4.npy", array_365x4)
loaded_array = np.load("array_365x4.npy")
print("Shape of loaded array:", loaded_array.shape)
print("Size of array_365x4.npy", os.path.getsize("array_365x4.npy"), "bytes")

# create dataframe from array and write to pickle then retrieve from pickle
df_365x4 = pd.DataFrame(array_365x4)
df_365x4.to_pickle("dataframe_365x4.pkl")
df_from_pickle = pd.read_pickle("dataframe_365x4.pkl")
print("DataFrame from pickle:\n", df_from_pickle)
print("Size of dataframe_365x4.pkl:", os.path.getsize("dataframe_365x4.pkl"), "bytes")

# convert to excel file
df_365x4.to_excel("dataframe_365x4.xlsx", index=False)

# create dataframe from Excel file and print results
df_from_excel = pd.read_excel("dataframe_365x4.xlsx")
print("DataFrame from Excel:\n", df_from_excel)

# json string
json_string = '{"country":"Netherlands", "dma_code":"0", "timezone":"Europe/Amsterdam", "area_code":"0", "ip":"46.19.37.108", "asn":"AS196752", "continent_code":"EU", "isp":"Tilaa V.O.F", "longitude":5.75, "latitude":52.5, "country_code":"NL", "country_code3":"NLD"}'

# parse JSON and print it
data = json.loads(json_string)
print("Original Country:", data["country"])

# overwrite value of Netherlands with my value
data["country"] = "JimBob"
print("Updated Country:", data["country"])

# use pandas to create pandas series
series = pd.read_json(json.dumps(data), typ='series')
print("Pandas Series:\n", series)

# change country value
series["country"] = "BobJim"

# convert to JSON string
json_string_updated = series.to_json()
print("Updated JSON string:\n", json_string_updated)