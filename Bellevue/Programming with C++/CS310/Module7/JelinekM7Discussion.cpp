// Author: Timothy Jelinek
// Date: 4/18/2024
// Description: This program has an enum that lists the alphabet and then says the best letter is 'N' and prints it as the best letter.

#include <iostream>
#include <conio.h>
 
using namespace std;



int main() {
    // declare array
    int numbers[6][2] = {
        {12, 48},
        {30, 15},
        {20, 25},
        {31, 21},
        {89, 98},
        {54, 62}
    };

    // This runs through the array and prints the numbers row by row
    for (int i = 0; i < 6; ++i) {
         for (int j = 0; j < 2; ++j) {
            cout << "\t" << numbers[i][j];
        }
    };

    cout << "\nPress any key to exit the program.";
    _getch(); // pause the program so the user can see the output

    return 0;
}