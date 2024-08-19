# -*- coding: utf-8 -*-
"""
Created on Wed Oct 13 14:20:12 2021

@author: Tim
"""

#get letter grade from user
letter = input("Enter a letter grade: ")

#convert the letter portion of the grade to a number
if letter[0] == "A" :
    num = 4.0
elif letter[0] == "B" :
    num = 3.0
elif letter[0] == "C" :
    num = 2.0
elif letter[0] == "D" :
    num = 1.0
elif letter[0] == "F" :
    num = 0.0
else :
    num = 0.0

#handle the + or - if it is present
if len(letter) > 1 and letter[0] != "F" :
    if letter[1] == "+" and letter[0] != "A":
        num = num + 0.3
    elif letter[1] == "-" :
        num -= 0.3 #num = num - 0.3
        
#display the result
print("The numeric value is %s." % num)
