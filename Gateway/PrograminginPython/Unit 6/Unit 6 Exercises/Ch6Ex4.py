# -*- coding: utf-8 -*-
"""
Created on Wed Nov  3 14:07:34 2021

@author: Tim
"""

#Define constant variables
ONE_TEN = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
ONE_NINE = [1, 2, 3, 4, 5, 6, 7, 8, 9]

def main():
    print("Here is the original list: ", ONE_TEN)
    
    #Swap the first and last elements in the list.
    data = list(ONE_TEN)
    swapFirstLast(data)
    print("After swapping first and last: ", data)
    
    #Shift all numbers to right
    data = list(ONE_TEN)
    shiftRight(data)
    print("After shifting right: ", data)
    
    #Replace all even elements with 0
    data = list(ONE_TEN)
    replaceEven(data)
    print("After replacing even elements: ", data)
    
    #Replace each element except the first and last by the larger of its two neighbors
    data = list(ONE_TEN)
    replaceNeighbors(data)
    print("After replacing with neighbors: ", data)
    
    #Remove the middle element if the list length is odd, or two elements if length is even
    data1 = list(ONE_TEN)
    data2 = list(ONE_NINE)
    removeMiddle(data1)
    removeMiddle(data2)
    print("After removing the middle element(s) 1: ", data1 )
    print("After removing the middle element(s) 2:  ", data2)
    
    #Move all the even elements to the front, othrwise perserving the order of the elements.
    data = list(ONE_TEN)
    evenToFront(data)
    print("After moving even elements: ", data)
    
    #return second - larget element in list
    print("The second largest value is: ", secondLargest(ONE_TEN))
    
    #return true if the list is currently in increasing order
    print("The list is in increasing order orig 1-10:", isIncreasing(ONE_TEN))
    
    #return true if list contains two adjacent duplicate elements
    print("The list had adjacent duplicates in orig: ",hasAdjacentDuplicate(ONE_TEN))
    
    #Return true if the list contains duplicate elements which dont need to be adjacent
    print("The list had duplicates in orig: ",hasDuplicate(ONE_TEN))
    
          
    
############ All Functions Below #########
def swapFirstLast(data):
    temp = data[0]
    data[0] = data[len(data) - 1]
    data[len(data) - 1] = temp
    
def shiftRight(data):
    last = data[len(data) - 1]
    for i in range(len(data) - 1, 0, -1):
        data[i] = data[i - 1]
    data[0] = last
    
def replaceEven(data):
    for i in range(0, len(data)):
        if data[i] % 2 == 0:
            data[i] = 0
            
def replaceNeighbors(data):
    for i in range(1, len(data) -1):
        data[i] = max(data[i-1], data[i+1])
        
def removeMiddle(data):
    if len(data) % 2 == 1:
        data.pop(len(data) // 2)
    else:
        data.pop(len(data) // 2)
        data.pop(len(data) // 2)
        
def evenToFront(data):
    evenPos = 0
    pos = 0
    while pos < len(data):
        if data[pos] % 2 == 0:
            temp = data.pop(pos)
            data.insert(evenPos, temp)
            evenPos += 1
        pos += 1
        
def secondLargest(data):
    largest = max(data)
    secondLargest = min(data)
    for value in data:
        if value > secondLargest and value != largest:
            secondLargest = value
    return secondLargest

def isIncreasing(data):
    for i in range(0, len(data)-1):
        if data[i] > data[i + 1]:
            return False
    return True

def hasAdjacentDuplicate(data):
    for i in range(0, len(data)-1):
        if data[i] == data[i+1]:
            return True
    return False

def hasDuplicate(data):
    for i in range(0, len(data) - 1):
        for j in range(i + 1, len(data)):
            if data[i] == data[j]:
                return True
        return False
main()