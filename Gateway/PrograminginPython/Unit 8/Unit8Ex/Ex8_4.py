# -*- coding: utf-8 -*-
"""
Created on Wed Nov 17 14:24:13 2021

@author: Tim
"""

from math import sqrt, floor

#read input from the user
n = int(input("Enter a positive integer:"))

#start with all numbers from 2 to n
primes = set(range(2, n + 1))

for i in range(2, floor(sqrt(n)) + 1):
    for j in range(2, n // 2):
        primes.discard(i * j)
        
#display primes
print("The primes less than or equal to", n, "are:")
for p in sorted(primes) :
    print(" ", p)
    