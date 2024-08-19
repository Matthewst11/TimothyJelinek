# -*- coding: utf-8 -*-
"""
Created on Wed Sep 22 14:13:27 2021

@author: Tim
"""

#Get two integers from the user  (INPUT)
num1 = int(input("Please enter an integer ( counting number): "))
num2 = int(input("Please enter another integer : "))

# Do the math (PROCESSING)
sumOfNumbers = num1 + num2
dif = num1 - num2
prod = num1 * num2
avg = sumOfNumbers / 2
dist = abs(dif)
myMin = min(num1, num2,)
myMax = max(num1, num2,)

# Display the results (OUTPUT)
print() #prints a blank line to look better
print("%-18s%9d" % ("Sum:", sumOfNumbers))
print("%-18s%9d" % ("Difference:", dif))
print("%-18s%9d" % ("Product:", prod))
print("%-18s%12.2f" % ("Average:", avg))
print("%-18s%9d" % ("Distance:", dist))
print("%-18s%9d" % ("Minimum:", myMin))
print("%-18s%9d" % ("Maximum:", myMax))
