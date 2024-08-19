# -*- coding: utf-8 -*-
"""
Created on Wed Oct 27 14:29:19 2021

@author: Tim
"""

def main():
    print("firstDigit of 1729 is", firstDigit(1729))
    print("firstDigit of 1 is", firstDigit(1))
    print("firstDigit of 555 is", firstDigit(555))
    
    print("lastDigit of 1729 is", lastDigit(1729))
    print("lastDigitt of 1 is", lastDigit(1))
    print("lastDigit of 555 is", lastDigit(555))
    
    print("digits of 1729 is", digits(1729))
    print("digits of 1 is", digits(1))
    print("digits of 555 is", digits(555))
    
def firstDigit(n):
    string = str(n)
    first = int(string[0])
    return first

def lastDigit(n):
    return n % 10
    
def digits(n):
    string = str(n)
    return len(string)


main()