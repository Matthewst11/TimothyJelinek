/*
Timothy Jelinek
CS 310
04/07/2024

Fixed two intentional errors in program


*/

// Define an enumeration for days of the week
#include <iostream>
#include <conio.h>

using namespace std;

double compareNumbers(double x, double y);


int main()
{
    double x, y;

    cout << "\n\n  Enter the first number: ";
    cin >> x;

    cout << "\n  Enter the second number: ";
    cin >> y;

    cout << "\n  The larger number is " << compareNumbers(x, y) << endl;
    cout << "\n  Press any key to continue..." << endl;

    _getch();
    return 0;
}

double compareNumbers(double x, double y) {
    if (x >= y) return x;
    else return y;
    }