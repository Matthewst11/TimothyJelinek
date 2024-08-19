# -*- coding: utf-8 -*-
"""
Created on Wed Oct  6 14:38:22 2021

@author: Tim
"""

#declare the constants
TAX_RATE = 0.075
SHIPPING_PER_BOOK = 2.0

#get inputs
bookPrice = float(input("Enter the total cost of the books: "))
numBooks = int(input("Enter the number of books: "))

#do the math
tax = TAX_RATE * bookPrice
shipping = numBooks * SHIPPING_PER_BOOK
totalPrice = bookPrice + tax + shipping

#display result
print("\n\nThe total cost of the order is $%.2f" % totalPrice)
