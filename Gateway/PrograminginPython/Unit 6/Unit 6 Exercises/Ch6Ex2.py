# -*- coding: utf-8 -*-
"""
Created on Wed Nov  3 13:22:14 2021

@author: Tim
"""

##
#Build a list of 10 unique values
#

#Define constant variables
NUM_INTEGERS = 10

#Read a collection of values from the user, adding each to the list if it is not already present
values = []
while len(values) < NUM_INTEGERS:
    x = float(input("Enter a number: "))
    if x not in values:
        values.append(x)

#Display the values in the list
print("The numbers are: ", values)
    
    