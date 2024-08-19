# -*- coding: utf-8 -*-
"""
Created on Wed Nov 10 16:49:40 2021

Purpose: Add Docstrings to help users understand the functions and their purpose

"""

#create a set
zoo = set(["dog", "cat", "zebra", "moose", "lion", "fox", "fish", "bird"])

def main():
    """
    Main function to run the zoo management program.
    """
    choice = 0
    while choice != 5:
        choice = displayMenu()
        
        if choice == "1":
            #display animals
            displayAnimals()
        elif choice == "2":
            #add animal
            addAnimal()
        elif choice == "3":
            #remove animal
            removeAnimal()
        elif choice == "4":
            #find an animal
            animal = input("Enter animal to find: ")
            result = findAnimal(animal)
            print(result)
        else:
            choice = 5
            print("Thanks for taking care of the animals.")          
        
def displayAnimals():
    """
    Display the list of animals in the zoo.
    """
    i = 1
    print()
    print("Animals")
    print("--------")
    for animal in sorted(zoo):
        print(i, ": ", animal)
        i = i + 1

def displayMenu():
    """
    Display the menu of options for the user to choose from.
    """
    choice = 0
    print()
    print("1. Display animals")
    print("2. Add an animal")
    print("3. Remove an animal")
    print("4. Find an animal")
    print("5. Quit")
    
    choice = input("Your choice: ")
    
    return choice

def findAnimal(animal):
    """
    Find if an animal is present in the zoo.
    
    Parameters:
        - animal (str): The name of the animal to find.
    
    Returns:
        - str: A message indicating whether the animal was found or not.
    """
    if animal in zoo:
        result = "Found " + animal
    else:
        result = animal + " not found in the set!"
        
    return result

def removeAnimal():
    """
    Remove an animal from the zoo.
    """
    animal = input("Remove which animal: ")
    
    if len(animal) > 0:
        zoo.remove(animal)
        print(animal, " has been removed from the set.")
    else:
        print("No animal entered!")
    
def addAnimal():
    """
    Add an animal to the zoo.
    """
    animal = input("Add animal: ")
    
    if len(animal) > 0:
        zoo.add(animal)
        print(animal, " has been added to the set.")
    else:
        print("No animal entered!")

#run program
main()

