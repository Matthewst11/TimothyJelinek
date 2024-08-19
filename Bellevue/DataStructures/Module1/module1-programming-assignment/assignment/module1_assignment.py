def find_max_min(numbers):
    """
    Find the maximum and minimum numbers in a list.
    Return them as a tuple (max, min).
    """
    if not numbers:
        return None, None #if list is empty
    return max(numbers), min(numbers)
    pass

def check_symmetry(string):
    """
    Check if the given string is symmetrical.
    Return True if it is, False otherwise.
    """
    return string == string[::-1]
    pass

def merge_sorted_lists(list1, list2):
    """
    Merge two sorted lists into a single sorted list.
    Return the merged sorted list.
    """
    return sorted(list1 + list2)
    pass

def sum_of_squares(nums):
    """
    Calculate and return the sum of squares of the numbers in the list.
    """
    return sum(x ** 2 for x in nums)
    pass

def string_reversal(s):
    """
    Reverse the given string and return it.
    """
    return s[::-1]
    pass

def find_second_largest(nums):
    """
    Find and return the second largest number in the list.
    If the list is too short, return None.
    """
    if len(nums) < 2:
        return None
    sorted_nums = sorted(nums)
    return sorted_nums[-2]
    pass
