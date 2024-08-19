// Author: Timothy Jelinek
// Date: 5/20/2024
// Description: This program has a template used to find the maximum of two values

#include <iostream>
#include <conio.h>
 
using namespace std;

template <typename T>
T findMax(T a, T b) {
    return (a > b)? a : b;
}

int main() {
    int i1 = 11, i2 = 10;
    float f1 = 11.1, f2 = 99.9;
    char c1 = 'a', c2 = 'b';
    
    cout << "The maximum of " << i << " and " << i2 << " is " << findMax(i1, i2) << endl;
    cout << "The maximum of " << f1 << " and " << f2 << " is " << findMax(f1, f2) << endl;
    cout << "The maximum of " << c1 << " and " << c2 << " is " << finMax(c1, c2) << endl;
    
    cout << "\nPress any key to exit the program.";
    _getch(); // pause the program so the user can see the output

    return 0;
}