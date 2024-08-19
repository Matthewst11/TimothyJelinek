// Author: Timothy Jelinek
// Date: 5/31/2024
// Description: This program prompts user for a length in feet and inches then converts it to centimeters

#include <iostream>
#include <iomanip>
#include <conio.h>
#include <stdexcept>

class NegativeNumberException : public std::exception {
public:
    const char* what() const noexcept override {
        return "Negative number sent.  Please enter positive number.";
    }
};

class NonNumberException : public std::exception {
public:
    const char* what() const noexcept override {
        return "Non-number sent.  Please enter a number.";
    }
};    

double feetToCentimeters(double feet) {
    return feet * 30.48; // one foot = 30.48 centimeters
}

double inchesToCentimeters(double inches) {
    return inches * 2.54; // one inch = 2.54 centimeters
}

int main() {
    try {
        double feet, inches;
        std::cout << "Please enter a length in feet and inches: ";
        if (!(std::cin >> feet)) {
            throw NonNumberException();
        }
        if (feet < 0) {
            throw NegativeNumberException();
        }

        std::cout <<"Enter a length in feet and inches";
        if (!(std::cin >> inches)) {
            throw NonNumberException();
        }
        if (inches < 0) {
            throw NegativeNumberException();
        }

        double totalCentimeters = feetToCentimeters(feet) + inchesToCentimeters(inches);

        std::cout << "Equivalent length in centimeters: " << totalCentimeters << " cm\n";
    } catch (const std::exception& e) {
        std::cerr << "Error: " << e.what() << std::endl;
    }
    std::cout << "\nPress any key to exit the program.";
    _getch(); // Pause the program so the user can see the output

    return 0;
}
