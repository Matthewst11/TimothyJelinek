// Author: Timothy Jelinek
// Date: 4/20/2024
// Description: This program asks for a string from the user then removes the vowels and prints the string without the vowels.

#include <iostream>
#include <conio.h> // Needed for _getch()
#include <string>
#include <algorithm>
using namespace std;

// function that checks if letters are vowels
bool isVowel(char c) {
    c = std::tolower(c); // makes all letters lowercase
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
}

// function to remove vowels
std::string removeVowels(const std::string& str) {
    std::string result;
    for (char c : str) {
        if (!isVowel(c)) {
            result += c;
        }
    }
    return result;
}

int main() {
    std::string inputString;
    std::cout << "Enter a string: ";
    std::getline(std::cin, inputString);

    std::string stringWithoutVowels = removeVowels(inputString);
    std::cout << "String without vowels: " << stringWithoutVowels << std::endl;

    cout << "\nPress any key to exit the program.";
    getch(); // Pause the program so the user can see the output

    return 0;
}