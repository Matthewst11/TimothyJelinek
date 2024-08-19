import pandas as pd

data = pd.read_csv("dogs.csv", usecols = ["name", "breed"])
print(data)