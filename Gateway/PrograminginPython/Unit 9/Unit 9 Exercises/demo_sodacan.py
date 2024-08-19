# -*- coding: utf-8 -*-
"""
Created on Wed Nov 24 14:35:18 2021

@author: Tim
"""

from soda_can import SodaCan

# construct a couple fo cans
can1 = SodaCan(20, 5)
can2 = SodaCan(30, 10)

sa = can1.getSurfaceArea()
vol = can1.getVolume()

print("Can 1's Surface Area is ", sa)
print("Can 1's Volume is ", vol)

sa = can2.getSurfaceArea()
vol = can2.getVolume()

print("Can 2's Surface Area is ", sa)
print("Can 2's Volume is ", vol)
