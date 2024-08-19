# -*- coding: utf-8 -*-
"""
Created on Wed Nov 24 12:45:12 2021

@author: Tim
"""

class Address :
   ## Constructs an address with or without an apartment number.
   #  @param house the house number
   #  @param street the street name
   #  @param apt the apartment number (optional)
   #  @param city the name of the city
   #  @param state the name of the state
   #  @param postal the postal code
   #
   def __init__(self, house, street, city, state, postal, apt=""):
       self._house = house
       self._street = street
       self._apt = apt
       self._city = city
       self._state = state
       self._postal = postal

   ## print an address
   def printAddress(self):
       print(self._house, self._street)
       if self._apt != "":
           print("Apt #", self._apt)
       print("%s, %s %s" % (self._city, self._state, self._postal))
        
    ## Determine if one address comes before anotherby postal code.
    # @param other the other address to consider for comparison
    # @return True if self is less than other, False otherwise
    #
   def comesBefore(self, other):
       return self._postal < other._postal
    