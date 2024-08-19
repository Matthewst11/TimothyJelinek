# -*- coding: utf-8 -*-
"""
Created on Thu Oct 21 01:11:15 2021

@author: Tim
"""


inputStr = input("Enter a string: ")

for ch in inputStr:
    if ch in "aeiouAEIOU":
        print("_", end="")
    else:
        print(ch, end="")
        

print()
    