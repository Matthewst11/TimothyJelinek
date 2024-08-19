# -*- coding: utf-8 -*-
"""
Created on Wed Nov 17 14:44:21 2021

@author: Tim
"""

def main():
    #read in 2 files and store in 2 sets
    words1 = fileWords()
    words2 = fileWords()
    
    #construct a set containing words common to both files
    common = words1.intersection(words2)
    
    #display the words alphabetically
    print("The words that are common to both filoes.")
    for word in sorted(common):
        print(" ", word)
    
def fileWords():
    #Read in a file
    filename = input("Enter the name of a text file: ")
    inf = open(filename, "r")
    #create a set to hold the words
    words = set()
    #loop the file line by line extract each word and add it to the set
    for line in inf:
        parts =line.split()
        for word in parts:
            words.add(word)
    return words
    
    
    
    
main()