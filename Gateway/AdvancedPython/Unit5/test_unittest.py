import unittest
import math

class TestStringMath(unittest.TestCase):
    
    def test_string_equality(self):
        name = 'slarty' * 3
        name2 = 'slartyslartyslarty'
        self.assertEqual(name, name2)
        
    def test_floor(self):
        y = math.floor(1.4)
        self.assertEqual(y, 1)
            
    def test_exponent(self):
        x = pow(4, 3)
        self.assertEqual(x, 64)
            
if __name__ == '__main__':
    unittest.main()