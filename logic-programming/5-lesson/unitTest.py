from homework import *
import unittest

class TestHomework(unittest.TestCase):
    def test_checkEquality(self):
        self.assertAlmostEqual(checkEquality(2,2),True)
