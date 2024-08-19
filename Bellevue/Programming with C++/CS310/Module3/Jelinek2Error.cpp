// Author: Timothy Jelinek
// Date: 3/28/2024
// Description: This program asks for an age to see if you are able to enter a club.

#include <iostream>
#include <conio.h> 
#include <string>
using namespace std;

int main() {
    // Declare variables
    int age;

    // Input ask for age
    cout << "What is your age? ";
    cin >> age;
    
    // Functions to check if age is over 21 and if they can enter the club or not
    if (age >= 21)
        cout << "You may enter.  Have fun!";
    else
        cout << "You may not enter until you are 21.  Please go home safely.";

    cout << "\nPress any key to exit the program.";
    _getch(); // Pause the program so the user can see the output

    return 0;
}