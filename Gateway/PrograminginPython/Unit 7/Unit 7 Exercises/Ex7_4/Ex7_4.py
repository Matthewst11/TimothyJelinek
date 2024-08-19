# -*- coding: utf-8 -*-
"""
Created on Wed Nov 10 13:26:25 2021

@author: Tim
"""

filename = input("Enter the input file name: ")
inf = open(filename, "r")

total_1 = 0
total_2 = 0
count = 0
for line in inf:
    parts = line.split()
    total_1 = total_1 + float(parts[0])
    total_2 += float(parts[1])
    count += 1
    
inf.close()

print("total 1 = ", total_1)
print("total 2 = ", total_2)
print("count = ", count)

avg1 = total_1 / count
avg2 = total_2 / count

print("The averages are %.4f and %.4f " % (avg1, avg2))
