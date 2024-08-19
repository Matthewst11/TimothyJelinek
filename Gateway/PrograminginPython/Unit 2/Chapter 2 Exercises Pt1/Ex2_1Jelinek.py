# -*- coding: utf-8 -*-
"""
Created on Wed Sep 22 12:50:26 2021

@author: Tim


"""

# declare the constants of the program
MILLIMETERS_PER_INCH = 25.4
WIDTH_OF_PAPER_IN_INCHES = 8.5
LENGTH_OF_PAPER_IN_INCHES = 11.0

widthInMillimeters = WIDTH_OF_PAPER_IN_INCHES * MILLIMETERS_PER_INCH

lengthInMillimeters = LENGTH_OF_PAPER_IN_INCHES * MILLIMETERS_PER_INCH

print("A standard sheet of 8.5 x 11 inch paper, has these dimensions:")
print(round(widthInMillimeters, 1), " mm x ", round(lengthInMillimeters, 1), " mm")
