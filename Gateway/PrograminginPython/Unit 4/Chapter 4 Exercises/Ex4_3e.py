# -*- coding: utf-8 -*-
"""
Created on Thu Oct 21 01:17:57 2021

@author: Tim
"""

inputStr = input("Enter a string: ")

for i in range(0, len(inputStr)):
    if inputStr[i] in "AEIOUaeiou":
        print(i, end=" ")
        
print()
