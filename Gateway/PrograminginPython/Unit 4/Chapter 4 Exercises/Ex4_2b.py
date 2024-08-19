# -*- coding: utf-8 -*-
"""
Created on Thu Oct 21 00:41:15 2021

@author: Tim
"""

even = 0
odd = 0

inputStr = input("Enter an integer (blank line to quit): ")
if inputStr == "":
    print("Program done - you entered nothing")
    
while inputStr != "":
     value = int(inputStr)
     if value % 2 == 0:
       even = even + 1
     else: 
       odd = odd + 1
     inputStr = input("Enter an integer (blank line to quit): ")  
print("The user entered", even, "even values and", odd, "odd values.")
