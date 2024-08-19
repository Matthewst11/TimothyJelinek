# -*- coding: utf-8 -*-
"""
Created on Wed Oct 27 14:42:36 2021

@author: Tim
"""

def main():
    inputStr = input("Enter a string: ")
    count = int(input("How many repetitions? "))
    delimiter = input("Separated by? ")


    print(repeat(inputStr, count, delimiter))
    

def repeat(string, n, delim):
    retval = string
    for i in range(1, n):
        retval = retval + delim + string
    return retval 
    
    

    
main()