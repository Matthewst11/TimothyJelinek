def selection_sort(nums):
    """
    Implement the selection sort algorithm to sort the list 'nums' in ascending order.
    Return the sorted list.
    """
    for i in range(len(nums)):
        min_index = i
        for j in range(i + 1, len(nums)):
            if nums[j] < nums[min_index]:
                min_index = j
        nums[i], nums[min_index] = nums[min_index], nums[i]
    return nums
    pass

def quick_sort(arr):
    """
    Implement the quick sort algorithm to sort the list 'arr' in ascending order.
    Return the sorted list.
    """
    if len(arr) <=1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quick_sort(left) + middle + quick_sort(right)
    pass

def binary_search_first_occurrence(arr, x):
    """
    Implement a variation of binary search to find the first occurrence of 'x' in the sorted list 'arr'.
    Return the index of the first occurrence of 'x'. If 'x' is not present in 'arr', return -1.
    """
    first_index, last_index = 0, len(arr) - 1
    while first_index <= last_index:
        mid_index = (first_index + last_index) // 2
        if arr[mid_index] == x and (mid_index == 0 or arr[mid_index - 1]!= x):
            return mid_index
        elif arr[mid_index] >= x:
            last_index = mid_index - 1
        else:
            first_index = mid_index + 1
    pass
