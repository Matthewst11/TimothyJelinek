import math

#get a list of available functions in the math module
math_functions = dir(math)

#print the available functions
print("Available functions in the math module:")
for function in math_functions:
    print(function)

def mySquare(n):
    """
    Calculate the square root of a number.

    Args:
        n (float): The number to calculate the square root of.

    Returns:
        float: The square root of the given number.
    """
    return math.sqrt(n)

#use the __doc__ attribute to display the Docstring help
print("Docstring help using __doc__ attribute:")
print(mySquare.__doc__)

#use the help() function to display information about mySquare(n)
print("\nHelp using help() function:")
help(mySquare)

#zoo.py

def animal_sound(animal):
    """
    Print the sound made by the given animal.

    Args:
        animal (str): The name of the animal.

    Returns:
        None
    """
    if animal == "lion":
        print("The lion roars.")
    elif animal == "tiger":
        print("The tiger growls.")
    elif animal == "bear":
        print("The bear grunts.")
    else:
        print("Unknown animal.")

# Display information about the animal_sound function
help(animal_sound)

# Call the animal_sound function
animal_sound("lion")