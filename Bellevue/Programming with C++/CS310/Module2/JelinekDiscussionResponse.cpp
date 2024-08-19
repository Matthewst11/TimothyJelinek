/*
    Student Name: Timothy Jelinek
    Date: 03/24/2024
    Description: Fixing simple input/output program with errors purposely included.
*/

#include <iostream>
#include <conio.h>

using namespace std;

int main()
{
    double firstNumber;
    double secondNumber;
    double sum;

    cout << "\n\n  Enter a number: ";
    cin >> firstNumber;

    cout << "\n  Enter a second number: ";
    cin >> secondNumber;

    sum = firstNumber + secondNumber;

    cout << "\n  The sum of " << firstNumber << " and " << secondNumber << " is " << sum << endl;
    cout << "\n  Press any key to continue..." << endl;

    _getch();

    return 0;
}