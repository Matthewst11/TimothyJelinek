# -*- coding: utf-8 -*-
"""
Created on Wed Dec  1 12:39:37 2021

@author: Tim
"""

##
# A car that tracks its fuel consumption as it is driven.

class Car:
    # Constructs a new car object with a given fuel efficiency
    # @param fuel_efficency - the mpg of the car
    def __init__(self, fuel_efficiency):
        self._fuel_efficiency = fuel_efficiency
        self._gas = 0
        
    ## Add gas to the car's tank
    # @param amount - the amount of gas in the tank
    def addGas(self, amount):
        self._gas += amount
        
    ## simulate driving the car
    # @param distance - how far the car was driven
    def drive(self, distance):
        self._gas = self._gas - (distance / self._fuel_efficiency)
        
    ## get the amount of gas in the tank that is left
    # @return - the amount of gas in the tank
    def getGasLevel(self):
        return self._gas