# -*- coding: utf-8 -*-
"""
Created on Wed Oct 27 15:02:24 2021

@author: Tim
"""

def main():
    inputStr = input("Enter a string: ")
    print("The string contains", countWords(inputStr), "words")
    
    
def countWords(string):
    string = string.strip()
    if string == "": return 0
    count = 1
    for ch in string:
        if ch == " ":
            count += 1
    return count







main()