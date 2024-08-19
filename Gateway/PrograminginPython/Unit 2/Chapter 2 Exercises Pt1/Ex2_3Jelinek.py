# -*- coding: utf-8 -*-
"""
Created on Wed Sep 22 13:46:23 2021

@author: Tim
"""

#Get a number from the user
number = int(input("Please enter an integer (counting number) to see its powers: "))
#num2 = int(number) or you can convert to an integer after

# Do the math
square = number * number
cube = number * number * number
fourth = number ** 4

# Display the results to the user in a friendly way
print()
print("Thank you for entering a numbwe.  Here are your results . . . .")
print("The square of your number is ", square)
print("The cube of your number is ", cube)
print("Your number to the fourth power is ", fourth)
print()
print("Thank you, come again.")
