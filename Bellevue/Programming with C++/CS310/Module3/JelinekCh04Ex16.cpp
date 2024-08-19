// Author: Timothy Jelinek
// Date: 3/28/2024
// Description: This program calculates the royalties earned through selling each book.

#include <iostream>
#include <conio.h> 
#include <string>
#include <iomanip>
using namespace std;

int main() {
    // Declare variables
    double netPrice;
    int estimatedCopies;
    const double OPTION_ONE_FIXED_ROYALTY = 5000;
    const double OPTION_ONE_PUBLISHED_ROYALTY = 20000;
    const double OPTION_TWO_ROYALTY_RATE = 0.125;
    const double OPTION_THREE_ROYALTY_RATE_UNDER_4000 = 0.1;
    const double OPTION_THREE_ROYALTY_RATE_OVER_4000 = 0.14;

    // Ask for author input
    cout << "Please enter the net price of each copy of the novel: $";
    cin >> netPrice;
    cout << "Please enter the estimated number of copies that will be sold: ";
    cin >> estimatedCopies;
    
    // Calculate royalties for each option
    double optionOneRoyalties = OPTION_ONE_FIXED_ROYALTY + OPTION_ONE_PUBLISHED_ROYALTY;
    double optionTwoRoyalties = netPrice * OPTION_TWO_ROYALTY_RATE * estimatedCopies;
    double optionThreeRoyalties;
    
    if (estimatedCopies <= 4000) {
        optionThreeRoyalties = netPrice * OPTION_THREE_ROYALTY_RATE_UNDER_4000 * estimatedCopies;
    } else {
        optionThreeRoyalties = (netPrice * OPTION_THREE_ROYALTY_RATE_UNDER_4000 * 4000) +
                              (netPrice * OPTION_THREE_ROYALTY_RATE_OVER_4000 * (estimatedCopies - 4000));
    }

     // Determine the best option
    string bestOption;
    if (optionOneRoyalties > optionTwoRoyalties && optionOneRoyalties > optionThreeRoyalties) {
        bestOption = "Option One";
    } else if (optionTwoRoyalties > optionOneRoyalties && optionTwoRoyalties > optionThreeRoyalties) {
        bestOption = "Option Two";
    } else {
        bestOption = "Option Three";
    }

    // Output the results
    cout << fixed << setprecision(2);
    cout << "Royalties under Option One: $" << optionOneRoyalties << endl;
    cout << "Royalties under Option Two: $" << optionTwoRoyalties << endl;
    cout << "Royalties under Option Three: $" << optionThreeRoyalties << endl;
    cout << "Best option for the author: " << bestOption << endl;
    _getch(); // Pause the program so the user can see the output

    return 0;
}