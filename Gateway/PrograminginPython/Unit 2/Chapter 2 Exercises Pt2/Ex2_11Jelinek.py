# -*- coding: utf-8 -*-
"""
Created on Wed Sep 22 14:13:27 2021

@author: Tim
"""

#get inputs from user
tankAmount = float(input("Enter the fuel capacity of the vehicle: "))
mpg = float(input("Enter the fuel efficiency in MPG: "))
price = float(input("Enter the cost of a gallon of fuel: "))

#do the math- processing
costPer100 = (100 / mpg) * price
distance = mpg * tankAmount

#display the output
print("\nIt takes $%.2f of fuel to drive 100 miles." % costPer100)
print("The vehicle can travel", distance, "miles with the fuel in the tank. ")
