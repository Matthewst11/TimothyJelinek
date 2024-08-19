// Author: Timothy Jelinek
// Date: 3/17/2024
// Description: This program calculates the final price of an item based on the original price, markup percentage, and sales tax rate.

#include <iostream>
#include <conio.h> // Needed for _getch()
using namespace std;

int main() {
    // Declare variables
    double originalPrice, markupPercentage, salesTaxRate;
    double sellingPrice, salesTax, finalPrice;

    // Input original price, markup percentage, and sales tax rate
    cout << "Enter the original price of the item: ";
    cin >> originalPrice;

    cout << "Enter the markup percentage (e.g., 10 for 10%): ";
    cin >> markupPercentage;

    cout << "Enter the sales tax rate (e.g., 7.5 for 7.5%): ";
    cin >> salesTaxRate;

    // Calculate selling price
    sellingPrice = originalPrice * (1 + markupPercentage / 100.0);

    // Calculate sales tax
    salesTax = sellingPrice * (salesTaxRate / 100.0);

    // Calculate final price
    finalPrice = sellingPrice + salesTax;

    // Output results
    cout << "\nItem Details:\n";
    cout << "Original Price: $" << originalPrice << endl;
    cout << "Markup Percentage: " << markupPercentage << "%" << endl;
    cout << "Selling Price: $" << sellingPrice << endl;
    cout << "Sales Tax Rate: " << salesTaxRate << "%" << endl;
    cout << "Sales Tax: $" << salesTax << endl;
    cout << "Final Price: $" << finalPrice << endl;

    cout << "\nPress any key to exit the program.";
    getch(); // Pause the program so the user can see the output

    return 0;
}