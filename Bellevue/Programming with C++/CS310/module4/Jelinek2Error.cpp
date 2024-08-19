// Author: Timothy Jelinek
// Date: 4/4/2024
// Description: This program adds 2 to i as long as i is not bigger than 30.

#include <iostream>
#include <conio.h> 
using namespace std;

int main() {
    // variables
    int i = 0; 

    //program where checks if i is less than 30, then adds 2 to i if it is
    while (i < 30) 
    {
        cout << i << " "; // output the value of i
        i = i + 2; // add i by 2
    }

    cout << "\nPress any key to exit the program.";
    _getch(); // pause the program so the user can see the output

    return 0;
}