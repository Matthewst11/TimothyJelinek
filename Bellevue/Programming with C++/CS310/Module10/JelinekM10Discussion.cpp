// Author: Timothy Jelinek
// Date: 5/13/2024
// Description: This program declares an int, then declares a pointer and assigns assigns address of 'var' to it and prints the value of var, the address of var, the value of the pointer, and the content of the address pointed to by point_var.

#include <iostream>
#include <conio.h>
 
using namespace std;

int main() {
    int var = 10; // Declare int variable
    int * point_var = &var; // Declare pointer and assign address of 'var' to it

    // print value of 'var'
    cout < "var = " << var << endl;

    // print address of 'var'
    cout << "address = " << &var << endl;

    // print value of 'point_var'
    cout << "point_var = " << point_var << endl;

    // print content of address pointed to by 'point_var'
    cout << "Content of the address pointed to by 'point_var (*point_var) = " << point_var << end1;
    
    cout << "\nPress any key to exit the program.";
    _getch(); // pause the program so the user can see the output

    return 0;
}