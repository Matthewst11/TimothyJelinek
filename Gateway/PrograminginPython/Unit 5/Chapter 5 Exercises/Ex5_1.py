# -*- coding: utf-8 -*-
"""
Created on Wed Oct 27 12:49:22 2021

@author: Tim
"""

def main() :
    print("The smallest of 1, 2, and 3 is", smallest(1,2,3))
    print("The smallest of 1, 2, and 3 is", smallest(3,2,1))
    print("The smallest of 1, 2, and 3 is", smallest(3,1,2))
    print("The smallest of 1, 2, and 3 is", smallest(2,2,2))
    
    
    print("The average of 1, 2, and 3 is", average(1, 2, 3))
    print("The average of 10, 20, and 30 is", average(10, 20, 30))
    
#Part A - smallest
def smallest(x, y, z) :
    if x <= y and x <= z:
        return x
    if y <= x and y <= z:
        return y
    return z

#Part B - average
def average(x, y, z):
    avg = (x + y + z) / 3
    return avg







main()