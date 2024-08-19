# -*- coding: utf-8 -*-
"""
Program: U9_bad_code.py

@author: Slarty Bartfast
"""

import math

userId = "slarty" 
val = ""
number = 0

def updateUserId(): 
    global userId
    userId = userId + "_bartfast"
    
def getSquareRoot(number): 
    return math.sqrt(number)
    
print("UserId: ", userId) 

updateUserId() 

print("Updated UserId: ", userId)

val = input("Enter a value to get the square root: ")
number = int(val)
result = getSquareRoot(number)
print("The square root of " + str(number) + " is " + str(result))
