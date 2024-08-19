# -*- coding: utf-8 -*-
"""
Created on Thu Oct 21 00:55:23 2021

@author: Tim
"""

inputStr = input("Enter an integer (blank line to quit): ")

prev = inputStr


while inputStr != "":
    inputStr = input("Enter an integer (blank line to quit): ")
    if inputStr == prev:
        print(inputStr, "is a duplicate")
        
    prev = inputStr
    
