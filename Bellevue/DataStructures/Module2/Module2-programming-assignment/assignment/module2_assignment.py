class ListNode:
    def __init__(self, value=0, next=None):
        self.value = value
        self.next = next

def array_sum(arr):
    """
    Calculate and return the sum of elements in an array 'arr'.
    """
    sum = 0
    for each in arr:
        sum += each
    return sum
    pass

def find_middle_node(linked_list):
    """
    Find and return the middle node of a singly linked list.
    If the list has an even number of nodes, return the second middle node.
    """
    slow = linked_list
    fast = linked_list
    while fast and fast.next != None:
        slow = slow.next
        fast = fast.next.next
    return slow
    pass

def remove_duplicates_from_sorted_array(arr):
    """
    Given a sorted array, remove the duplicates in-place such that each element appears only once.
    Return the new length of the array.
    """
    if not arr:
        return 0
    write_index = 1
    for i in range(1, len(arr)):
        if arr[i] != arr[i - 1]:
            arr[write_index] = arr[i]
            write_index += 1
    return write_index
    pass
