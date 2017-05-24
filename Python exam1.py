"""
You must make two of the testcases pass to pass the test.

run tests with `python3 -m unittest exam1.py`
"""
from unittest import TestCase


class HiTestCase(TestCase):
    """
    Args:
        name: a string
        exclamation: optional, defaults to 'Hi'

    Returns:
        string with name prefixed by the
        exclamation.

    >>> test_function('Bob')
    'Hi Bob!'
    >>> test_function('Sally', exclamation='Bye')
    'Bye Sally!'
    """
    def setUp(self):
        self.test_function = None  # assign to your function

    def test_ex1(self):
        result = self.test_function('Kersti', 'Tere')
        self.assertEqual(result, 'Tere Kersti!')

    def test_ex2(self):
        result = self.test_function('Taavi')
        self.assertEqual(result, 'Hi Taavi!')


class IsOddTestCase(TestCase):
    """
    Args:
        numbers - a list of numbers

    Returns:
        Boolean
        True if an odd number exists in the list of numbers
        False if only even numbers exist in numbers.
    >>> test_function([1,2])
    # 1 is an odd number
    True
    >>> test_function([2,4])
    # Both 2 and 4 are even numbers
    False
    """
    def setUp(self):
        self.test_function = None  # assign to your function

    def test_ex1(self):
        result = self.test_function([20, 44, 19])
        self.assertEqual(result, True)

    def test_ex2(self):
        result = self.test_function([30, 100, 10])
        self.assertEqual(result, False)


class MapProductsTestCase(TestCase):
    """
    Args:
        multiplier: a number to multiply numbers by
        numbers: a list of numbers

    Returns:
        dict of numbers, mapping each number to the number multiplied by
        the multiplier

    >>> test_function(4, [1,2])
    # 1*4 = 4, 2*4 = 8
    {1: 3, 2: 8}
    """
    def setUp(self):
        self.test_function = None  # assign to your function

    def test_ex1(self):
        result = self.test_function(2, [3, 4, 1])
        self.assertEqual(result, {3: 6, 4: 8, 1: 2})

    def test_ex2(self):
        result = self.test_function(5, [5, 6])
        self.assertEqual(result, {5: 25, 6: 30})
