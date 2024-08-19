# -*- coding: utf-8 -*-
"""
Created on Wed Nov 17 14:58:01 2021

@author: Tim
"""

#Read a database of per capita income by country and allow user to query it

#Load the data in a dictionary
incomes = {}
inf = open("rawdata_2004.txt", "r")
for line in inf:
    #split the line based on tab stops
    parts = line.split("\t")
    #remove the dollar sign and comma
    parts[2] = parts[2].replace("$", "")
    parts[2] = parts[2].replace(",", "")
    #add the country to the dictionary all upper case to make easier to search
    incomes[parts[1].upper()] = float(parts[2])
    
#read queries from the user and respond
country = input("Enter a country name (or type 'quit' to exit): ").upper()
while country != "QUIT":
    #look for country in dictionary and output income otherwise display error
    if country in incomes:
        print("The per capita income is", incomes[country])
    else:
        print("That wasn't a recognized country.  Check the spelling.")
    print()
    country = input("Enter a country name (or type 'quit' to exit): ").upper()
    
print("Thank you for using this program.")