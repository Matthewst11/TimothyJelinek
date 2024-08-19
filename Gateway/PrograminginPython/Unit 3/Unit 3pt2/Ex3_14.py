# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
author: Tim
"""

card = input("Enter the card notation: ")
value = card[0]
if value == "1":
    value = "10"
    
suit = card[len(card) - 1]

if value == "J" :
    full_name = "Jack"
elif value == "Q":
    full_name = "Queen"
elif value == "K":
    full_name = "King"
elif value == "A":
    full_name ="Ace"
else:
    full_name = value

full_name = full_name + " of "

if suit == "S":
    full_name = full_name + "Spades"
elif suit == "H":
    full_name = full_name + "Hearts"
elif suit == "C":
    full_name = full_name + "Clubs"
elif suit == "D":
    full_name = full_name + "Diamonds"
    
print(full_name)