# -*- coding: utf-8 -*-
"""
Created on Thu Oct 21 00:49:02 2021

@author: Tim
"""

inputStr = input("Enter an integer (blank line to quit): ")

total = 0

while inputStr != "":
    value = int(inputStr)
    total = total + value
    print("The cumulative total is", total)
    inputStr = input("Enter an integer (blank line to quit):")
