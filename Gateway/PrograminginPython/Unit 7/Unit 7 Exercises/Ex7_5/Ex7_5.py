# -*- coding: utf-8 -*-
"""
Created on Wed Nov 10 13:44:44 2021

@author: Tim
"""

filename = input("Enter the input file name: ")
inf = open(filename, "r")

chars = 0
words = 0
lines = 0

for line in inf:
    lines += 1
    chars += len(line)
    words += len(line.split())
    
inf.close()

print("Line count is", lines)
print("Word count is", words)
print("Character count is", chars)
