# -*- coding: utf-8 -*-
"""
Created on Thu Oct 21 00:09:17 2021

@author: Tim
"""

a =int(input("Enter an integer: "))
b=int(input("Enter another integer: "))


if a % 2 == 0:
    first_num = a + 1
else:
    first_num = a

total = 0
for i in range(first_num, b + 1, 2):
    total = total + i
    
print("The total of the odd numbers from", a, "to", b, "is", total)
