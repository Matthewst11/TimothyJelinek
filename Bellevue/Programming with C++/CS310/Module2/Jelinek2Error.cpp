// Author: Timothy Jelinek
// Date: 3/21/2024
// Description: This program asks for and prints a name.

#include <iostream>
#include <conio.h> 
#include <string>
using namespace std;

int main() {
    // Declare variables
    string name;

    // Input ask for and confirm name given
    cout << "What is your name?";
    getline(cin, name);
    cout << "Your name is " << name << "." << endl;
    

    cout << "\nPress any key to exit the program.";
    _getch(); // Pause the program so the user can see the output

    return 0;
}