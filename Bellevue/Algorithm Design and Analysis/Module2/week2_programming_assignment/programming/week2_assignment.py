import time 

def calculate_execution_time(func, *args):
    """
    Calculate and return the time taken for function 'func' to execute with arguments '*args'.
    """
    start_time = time.time()
    func(*args)  # Call the function with provided arguments
    end_time = time.time()
    execution_time = end_time - start_time
    pass

def bubble_sort(nums):
    """
    Sort the list 'nums' using the bubble sort algorithm. Return the sorted list.
    """
    n = len(nums)
    for i in range(n):
        for j in range(0, n - i - 1):
            if nums[j] > nums[j + 1]:
                nums[j], nums[j + 1] = nums[j + 1], nums[j]
    return nums
    pass

def insertion_sort(nums):
    """
    Sort the list 'nums' using the insertion sort algorithm. Return the sorted list.
    """
    for i in range(1, len(nums)):
        key = nums[i]
        j = i - 1
        while j >= 0 and nums[j] > key:
            nums[j + 1] = nums[j]
            j -= 1
        nums[j + 1] = key
    return nums
    pass

def fibonacci_recursive(n):
    """
    Return the nth Fibonacci number using a recursive approach.
    """
    if n <= 1:
        return n
    else:
        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2)
    pass
