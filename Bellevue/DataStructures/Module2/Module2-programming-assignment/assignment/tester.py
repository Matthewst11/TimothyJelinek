# ----------------------------------------------------------
# Filename: tester.py
# Author: Nasheb Ismaily, Dr. Rob Flowers (update: 06-13-2024)
# ----------------------------------------------------------

import tests
from module2_assignment import *

# Helper function to create a linked list from a list of values
def create_linked_list(values):
    if not values:
        return None
    head = ListNode(values[0])
    current = head
    for value in values[1:]:
        current.next = ListNode(value)
        current = current.next
    return head

def run_tests(test_cases, function_to_test):
    total_tests = sum(len(test_cases[func]) for func in test_cases)
    test_counter = 0
    passed_tests = 0

    for func in test_cases:
        for case in test_cases[func]:
            test_counter += 1
            args, expected = case[:-1], case[-1]
            try:
                if func == "find_middle_node":
                    linked_list = create_linked_list(args[0])
                    got = function_to_test[func](linked_list)
                    if linked_list:
                        got = got.value
                else:
                    got = function_to_test[func](*args)

                if got == expected:
                    passed_tests += 1
                    print(f"Test {test_counter}/{total_tests}: Correct.")
                else:
                    print(f"Test {test_counter}/{total_tests}: Incorrect. Expected: {expected}, Got: {got}")

            except Exception as e:
                print(f"Test {test_counter}/{total_tests}: Error occurred: {e}")

    print(f"Passed {passed_tests} of {total_tests} tests.")

if __name__ == "__main__":
    test_cases = {
        "array_sum": tests.test_array_sum(),
        "find_middle_node": tests.test_find_middle_node(),
        "remove_duplicates_from_sorted_array": tests.test_remove_duplicates_from_sorted_array()
    }

    functions_to_test = {
        "array_sum": array_sum,
        "find_middle_node": find_middle_node,
        "remove_duplicates_from_sorted_array": remove_duplicates_from_sorted_array
    }

    run_tests(test_cases, functions_to_test)
