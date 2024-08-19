def collect_user_details(name, age, color):
    """
    Accept user details as parameters: name, age, and favorite color.
    Return them as a tuple.
    """
    #create tuple with name, age, and color
    user_details = (name,age,color)
    #return the tuple
    return user_details
    pass

def factorial(n):
    """
    Calculate and return the factorial of the given number 'n' using recursion.
    """
    if n == 0 or n ==1:
        return 1
    else:
        return n * factorial(n-1)
    pass

def sort_numbers(nums):
    """
    Sort the list 'nums' in ascending order without using built-in functions.
    Return the sorted list.
    """
    for i in range(len(nums)):
        for j in range(len(nums)-i-1):
            if nums[j] > nums[j+1]:
                #swap nums[j] and nums[i]
                nums[j], nums[j + 1] = nums[j + 1], nums[j]
    return nums
    pass
