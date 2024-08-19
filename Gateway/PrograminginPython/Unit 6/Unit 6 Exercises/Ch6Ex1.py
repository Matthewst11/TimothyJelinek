# -*- coding: utf-8 -*-
"""
Created on Wed Nov  3 12:48:21 2021

@author: Tim
"""

from random import randint

NUM_INTEGERS = 10

#generate the random integers and put thme into the list
values = []
for i in range(0,NUM_INTEGERS):
    values.append(randint(0, NUM_INTEGERS))
    
#test display of everything in the list
print("Test print of all elements for reference: ", end=" ")
for i in range(0,NUM_INTEGERS):
    print(values[i], end = " ")
print()
    
print("Elements at an even index position: ", end=" ")
for i in range(0,NUM_INTEGERS, 2):
    print(values[i], end = " ")
print()

#Display only the even numbers in the list
print("Elements at an even numbers: ", end=" ")
for i in range(0,NUM_INTEGERS):
    if values[i] % 2 == 0:
        print(values[i], end = " ")
print()

print("Display elements in reverse order: ", end=" ")
for i in range(NUM_INTEGERS - 1, -1, -1):
    print(values[i], end = " ")
print()

#Display the first and last elements
print("First and last items in the list: ", values[0], values[len(values) - 1])