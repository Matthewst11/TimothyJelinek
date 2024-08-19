# -*- coding: utf-8 -*-
"""
Created on Thu Oct 21 00:17:54 2021

@author: Tim
"""

digits = input("Enter an integer: ")
total = 0
for ch in digits:
    n = int(ch)
    if n % 2 == 1:
        total = total + n
        
print("The total of the odd digits in", digits, "is", total)

