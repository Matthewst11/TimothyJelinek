# -*- coding: utf-8 -*-
"""
Created on Wed Oct 20 23:40:02 2021

@author: Tim
"""

ch = input("Enter one character: ")
ch = ch.upper()

if len(ch) == 0 or len(ch) > 1:
    print("That input didn't have a valid length.")
elif ch in "AEIOU":
    print("Vowel")
elif ch >= "A" and ch <= "Z":
    print("Consonant")
else:
    print("That was neither a vowel nor a consonant.")
    