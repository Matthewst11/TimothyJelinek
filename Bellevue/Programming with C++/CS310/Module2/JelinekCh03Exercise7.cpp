// Author: Timothy Jelinek
// Date: 3/24/2024
// Description: This program calculates the interest on a credit card's unpaid balance.

#include <iostream>
#include <conio.h> // this is needed for _getch()
#include <iomanip> // this is needed for setprecision and fixed
#include <locale>  // this is needed for thousands separator
using namespace std;

int main() {
    // Declare variables
    double netBalance, payment, interestRate;
    int d1, d2;
    double averageDailyBalance;

    // ask for input for net balance, payment, and billing cycle days
    cout << "Enter the net balance shown in the bill: ";
    cin >> netBalance;

    cout << "Enter the payment made: ";
    cin >> payment;

    cout << "Enter the number of days in the billing cycle (d1): ";
    cin >> d1;

    cout << "Enter the number of days payment is made before the billing cycle (d2): ";
    cin >> d2;

    // calculate average daily balance on information given
    averageDailyBalance = (netBalance * d1 - payment * d2) / d1;

    // input interest rate per month
    cout << "Enter the interest rate per month (e.g., 0.0152 for 1.52%): ";
    cin >> interestRate;

    // calculate the interest
    double interest = averageDailyBalance * interestRate;

    // format the output to two decimal places
    cout << fixed << setprecision(2);

    // output results
    cout << "\nCredit Card Details:\n";
    cout << "Net Balance: $" << netBalance << endl;
    cout << "Payment: $" << payment << endl;
    cout << "Average Daily Balance: $" << averageDailyBalance << endl;
    cout << "Interest Rate per Month: " << interestRate * 100 << "%" << endl;
    cout << "Interest: $" << interest << endl;
    cout << "\nPress any key to exit the program.";
    getch(); // pause the program so the user can see the output

    return 0;
}