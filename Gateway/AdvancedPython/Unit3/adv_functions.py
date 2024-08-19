import math

multiplyTwoNumbers = lambda x, y: x * y

answer = multiplyTwoNumbers(2, 3)
print("Result of multiplying 2 numbers: ", answer, "\n")

integerList = [11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

#filter out even numbers using lambda function
evenNumbers = list(filter(lambda x: x % 2 == 0, integerList))
print("Even numbers:\n", evenNumbers, "\n")

#filter out odd numbers using lambda function
oddNumbers = list(filter(lambda x: x % 2 != 0, integerList))
print("Odd numbers:\n", oddNumbers, "\n")

#define the list of numbers to get the square root of
numbersToSquareRoot = [16, 25, 49, 81]

#define the function to calculate square root
def squareRoot(x):
    return math.sqrt(x)

#use map() function to apply squareRoot function to each element in the list
squaredNumbers = list(map(squareRoot, numbersToSquareRoot))

#print the original and squared lists
print("Original list:   ", numbersToSquareRoot)
print("Square root of the list using map():   \n", squaredNumbers)
