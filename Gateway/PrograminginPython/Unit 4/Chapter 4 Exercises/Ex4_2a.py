# -*- coding: utf-8 -*-
"""
Created on Thu Oct 21 00:27:48 2021

@author: Tim
"""

inputStr = input("Enter an integer (blank line to quit): ")

if inputStr != "" :
    value = int(inputStr)
    smallest = value
    largest = value
    
    while inputStr != "":
        value = int(inputStr)
        if (value < smallest):
            smallest = value
        if (value > largest):
            largest = value
        inputStr = input("Enter an integer (blank line to quit):")
    print("The smallest value is", smallest, "and the largest value is", largest)
else:
    print("\nNo input values were provided.")
