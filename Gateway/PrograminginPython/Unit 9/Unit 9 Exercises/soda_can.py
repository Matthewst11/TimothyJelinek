# -*- coding: utf-8 -*-
"""
Created on Wed Nov 24 14:17:22 2021

@author: Tim
"""

## 
#   This module defines the SodaCan class.
#

from math import pi

## 
#  A soda can that has a height and a radius
class SodaCan:
    ##Constructs a new soda can
    # @param height - the height of the can
    # @param radius - the radius of the can
    def __init__(self, height, radius):
        self._height = height
        self._radius = radius

    ## compute the surface area of the can
    #  @return the surface area of the can
    #
    def getSurfaceArea(self):
        return (2 * pi * self._radius * self._height) + (2 * pi * self._radius ** 2)
    
    ## COmpute the volume of the can
    # @return the volume of the can
    #
    def getVolume(self):
        return (pi * self._radius ** 2 * self._height)
    
