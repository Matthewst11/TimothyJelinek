# -*- coding: utf-8 -*-
"""
Created on Thu Oct 21 01:07:47 2021

@author: Tim
"""

inputStr = input("Enter a string: ")

for i in range(0, len(inputStr), 2):
    print(inputStr[i], end="")
print()
    
    