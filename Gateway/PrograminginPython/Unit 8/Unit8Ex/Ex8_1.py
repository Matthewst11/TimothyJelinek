# -*- coding: utf-8 -*-
"""
Created on Wed Nov 17 12:41:34 2021

@author: Tim
"""

## 
#  This program turns an integer into its English name.
#

#Define the constants - dictionaries of numeric names
DIGITS_NAMES = {1: "one", 2: "two", 3: "three", 4: "four", 5: "five", \
                6: "six", 7: "seven", 8: "eight", 9: "nine"}

TEEN_NAMES = {10: "ten", 11: "eleven", 12: "twelve", 13: "thirteen", \
              14: "fourteen", 15: "fifteen", 16: "sixteen", \
              17: "seventeen", 18: "eighteen", 19: "nineteen"}

TENS_NAMES = {90: "ninety", 80: "eighty", 70: "seventy", 60: "sixty", \
              50: "fifty", 40: "fourty", 30: "thirty", 20: "twenty"}



def main() :
   value = int(input("Please enter a positive integer < 1000: "))
   print(intName(value))

## Turns a number into its English name.
#  @param number a positive integer < 1,000
#  @return the name of the number (e.g. "two hundred seventy four")
#
def intName(number) :
   part = number   # The part that still needs to be converted.
   name = ""   # The name of the number. 

   if part >= 100 :
      name = DIGITS_NAMES[part // 100] + " hundred"
      part = part % 100

   if part >= 20 :
      name = name + " " + TENS_NAMES[part // 10 * 10]
      part = part % 10
   elif part >= 10 :
      name = name + " " + TEEN_NAMES[part]
      part = 0

   if part > 0 :
      name = name + " " + DIGITS_NAMES[part]

   return name

# Start the program.
main()

