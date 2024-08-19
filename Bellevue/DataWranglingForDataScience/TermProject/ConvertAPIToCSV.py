import requests 
import pandas as pd

# api url
api_url = 'https://www.fantasyfootballdatapros.com/api/players/2019/1'

try:
    response = requests.get(api_url)
    if response.status_code == 200:
        data = response.json()
    else:
        print(f'Error: {response.status_code}')
except Exception as e:
    print(f'Error: {e}')
    
df = pd.DataFrame(data)
df.to_csv('FootBallDataAPI.csv', index=False)