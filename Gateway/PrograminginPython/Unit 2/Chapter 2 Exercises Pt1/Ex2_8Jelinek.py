# -*- coding: utf-8 -*-
"""
Created on Wed Sep 22 14:28:43 2021

@author: Tim
"""
from math import sqrt


# Get input from our user (INPUT)
length = float(input("Enter the length of the rectangle: "))
width = float(input("Enter the width of the rectangle: "))

# Do the calculations (PROCESSING)
area = length * width
perimeter = (length * 2) + (width * 2)
diagonal = sqrt(length**2 + width**2)

#Display the results (OUTPUT)
print("The area is ", area)
print("The perimeter is", perimeter)
print("The diagonal length is %.2f" % diagonal)
