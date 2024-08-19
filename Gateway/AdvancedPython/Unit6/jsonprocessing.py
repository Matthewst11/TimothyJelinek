import pandas as pd

data = pd.read_json("dogs.json")
new_data = data.iloc[[1, 3, 5]]
print(new_data)

