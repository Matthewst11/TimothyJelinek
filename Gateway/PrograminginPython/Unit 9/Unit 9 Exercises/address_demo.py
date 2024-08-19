# -*- coding: utf-8 -*-
"""
Created on Wed Nov 24 13:43:38 2021

@author: Tim
"""

# import the class file (put in same directory so it can find it)
from address import Address

# construct 2 address in this sequence - house, street, city, state, postal, apt=""
a = Address(1313, "Mockingbird Lane", "Racine", "WI", "53403")
b = Address(1200, "Elm Street", "Kenosha", "WI", "53140", "12")

# demo the print method
print("Address A is: ")
a.printAddress()
print()

print("Address B is: ")
b.printAddress()
print()

print("Does Address A come before Address B:", a.comesBefore(b))