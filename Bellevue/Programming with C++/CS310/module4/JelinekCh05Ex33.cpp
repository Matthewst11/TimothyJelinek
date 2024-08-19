// Author: Timothy Jelinek
// Date: 4/7/2024
// Description: This program calculates the royalties earned through selling each book.

#include <iostream>
#include <conio.h> 
#include <string>
using namespace std;

int main() {
    // Declare variables
    int a, b, t;

    // asks for time for first dish and the additional time longer each next dish takes
    cout << "Enter the time (in minutes) to prepare the first dish (a): ";
    cin >> a;
    cout << "Enter the additional time (in minutes) for each following dish (b): ";
    cin >> b;
    cout << "Enter the total available time (in minutes) to prepare the dishes (t): ";
    cin >> t;

    int dishes = 0; // Initialize the count of dishes prepared
    int prepare_time = a; // Initialize the time for the first dish

    // keep preparing dishes until we run out of time
    while (prepare_time <= t) {
        dishes++;
        prepare_time += a + b * (dishes - 1); // calculate time for the next dish
    }

    cout << "Bianca can prepare " << dishes << " dishes." << endl;
    _getch(); // Pause the program so the user can see the output

    return 0;
}