# -*- coding: utf-8 -*-
"""
Created on Wed Dec  1 13:44:08 2021

@author: Tim
"""

##
# Demonstrate the car class
#

from car import Car

myHybrid = Car(50) # 50 miles per gallon
myHybrid.addGas(20) # Tank 20 gallons
myHybrid.drive(100)  # Drive 100 miles
print(myHybrid.getGasLevel()) #Print fuel remaining

myTDI = Car(46)
myTDI.addGas(13)
myTDI.drive(100)
print(myTDI.getGasLevel())

