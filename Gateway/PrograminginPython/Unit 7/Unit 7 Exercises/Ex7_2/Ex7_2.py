# -*- coding: utf-8 -*-
"""
Created on Wed Nov 10 12:59:20 2021

@author: Tim

"""

inputName = input("Enter the input file name: ")
outputName = input("Enter the output file name: ")

#Open the input and output file names
inf = open(inputName, "r")
outf = open(outputName, "w")

#Read lines from the file and save them to a new file wth line numbers.
number = 1
for line in inf:
    outf.write("/* " + str(number) + " */ " + line)
    number += 1
    
inf.close()
outf.close()

print("File editing complete.")