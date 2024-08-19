# -*- coding: utf-8 -*-
"""
Created on Thu Oct 21 01:21:40 2021

@author: Tim
"""

n = int(input("Enter an integer: "))

if n == 1:
    fneew = 1
elif n==2:
    fnew = 1
else:
    fold1 = 1
    fold2 = 1
    for i in range(2, n):
        fnew = fold1 + fold2
        fold1 = fold2
        fold2 = fnew
        
print("Fibonacci number", n, "is", fnew)
