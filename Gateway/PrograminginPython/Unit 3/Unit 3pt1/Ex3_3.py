# -*- coding: utf-8 -*-
"""
Created on Wed Oct 13 13:42:24 2021

@author: Tim
"""

#get input from user
num = int(input("Enter an Integer: "))

if num < 0:
    num =num * -1

#digits = 0

#determine number of digits
if num < 10 :
    digits = 1
elif num < 100:
    digits = 2
elif num < 1000:
    digits = 3
elif num < 10000:
    digits = 4
elif num < 100000:
    digits = 5
elif num < 1000000:
    digits = 6
elif num < 10000000:
    digits = 7
elif num < 100000000:
    digits = 8
elif num < 1000000000:
    digits = 9
elif num < 10000000000:
    digits = 10
else:
    digits = "-- DATA ENTRY ERROR --"

#display the results
print("The number you entered has", digits, "digits.")