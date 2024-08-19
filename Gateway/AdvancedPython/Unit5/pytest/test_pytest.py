import pytest
import math


def test_string_equality():
    name = 'slarty' * 3
    name2 = 'slartyslartyslarty'
    assert name == name2
    
def test_floor():
    y = math.floor(1.5)
    assert y == 1
    
def test_exponent():
    x = pow(4, 3)
    assert x == 64