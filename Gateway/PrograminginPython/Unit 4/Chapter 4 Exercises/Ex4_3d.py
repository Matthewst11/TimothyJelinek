# -*- coding: utf-8 -*-
"""
Created on Thu Oct 21 01:13:57 2021

@author: Tim
"""

inputStr = input("Enter a string: ")
count = 0
for ch in inputStr:
    if ch >= "0" and ch <="9":
        count = count + 1

    
        

print("The string contains", count, "digits.")
    