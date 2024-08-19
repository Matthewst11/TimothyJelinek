// Author: Timothy Jelinek
// Date: 4/13/2024
// Description: This program calculates the billing amount for high and low income customers getting their tax returns done.

#include <iostream>
#include <conio.h> // Needed for _getch()
#include <string>
#include <iomanip>
using namespace std;

double calculateBillingAmount(double incomeAmount, double consultingTime, double hourlyRate) {
    double billingAmount = 0.0;
    char incomeRate;

    // Figure out if high or low income based on if income entered is above or under $25,000
    if (incomeAmount <= 25000) {
        incomeRate = 'l'; // Low income
    } else {
        incomeRate = 'h'; // High income
    }

    // Calculate the billing amount based on income rate and consulting time
    if (incomeRate == 'l') {
        // Low income
        if (consultingTime <= 30) {
            // No charges if consulting time is 30 minutes or less
            billingAmount = 0.0;
        } else {
            // Service charges for time over 30 minutes
            double extraTime = consultingTime - 30;
            billingAmount = (hourlyRate * 0.40) * (extraTime / 60.0);
        }
    } else {
        // High income
        if (consultingTime <= 20) {
            // No charges if consulting time is 20 minutes or less
            billingAmount = 0.0;
        } else {
            // Service charges for time over 20 minutes
            double extraTime = consultingTime - 20;
            billingAmount = (hourlyRate * 0.70) * (extraTime / 60.0);
        }
    }

    return billingAmount;
}

int main() {
    // Declare variables
    double hourlyRate, consultingTime, billingAmount;
    double incomeAmount;

    // Ask for hourly rate, total consulting time, and the income rate
    cout << "Enter the hourly rate: $";
    cin >> hourlyRate;
    cout << "Enter total consulting time in minutes: ";
    cin >> consultingTime;
    cout << "Enter your income amount: $";
    cin >> incomeAmount;

    // Calculate the billingAmount
    billingAmount = calculateBillingAmount(incomeAmount, consultingTime, hourlyRate);
    cout << fixed << setprecision(2); // Set output format
    cout << "Billing amount: $" << billingAmount << endl;

    cout << "\nPress any key to exit the program.";
    getch(); // Pause the program so the user can see the output

    return 0;
}