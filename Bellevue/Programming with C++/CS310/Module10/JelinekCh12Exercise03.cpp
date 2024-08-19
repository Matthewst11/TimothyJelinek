// Author: Timothy Jelinek
// Date: 5/17/2024
// Description: This program asks users for the number of candidates and then creates appropriate dynamic arrays to hold the data

#include <iostream>
#include <iomanip>
#include <conio.h>
#include <string>

using namespace std;

int sumVotes(int list[], int size) {
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += list[i];
    }
    return sum;
}

int winnerIndex(int list[], int size) {
    int winInd = 0;
    for (int i = 0; i < size; ++i) {
        if (list[i] > list[winInd]) {
            winInd = i;
        }
    }
    return winInd;
}

int main() {
    int NUM_CANDIDATES;
    cout << "Enter the number of candidates: ";
    cin >> NUM_CANDIDATES;

    string* candidates = new string[NUM_CANDIDATES];
    int* votes = new int[NUM_CANDIDATES];
    int totalVotes = 0;

    // get input from user
    for (int i = 0; i < NUM_CANDIDATES; ++i) {
        cout << "Enter the name of candidate " << i + 1 << ": ";
        cin >> candidates[i];
        cout << "Enter the number of votes for " << candidates[i] << ": ";
        cin >> votes[i];
        totalVotes += votes[i];
    }

    // output candidate information
    cout << "Candidate\tVotes\tPercentage" << endl;
    for (int i = 0; i < NUM_CANDIDATES; ++i) {
        double percentage = (static_cast<double>(votes[i]) / totalVotes) * 100;
        cout << candidates[i] << "\t\t" << votes[i] << "\t\t" << fixed << setprecision(2) << percentage << "%" << endl;
    }

    // output total votes
    cout << "Total Votes:\t\t" << totalVotes << endl;

    // output winner
    int winnerIdx = winnerIndex(votes, NUM_CANDIDATES);
    cout << "The winner is " << candidates[winnerIdx] << "." << endl;

    delete[] candidates;
    delete[] votes;

    cout << "\nPress any key to exit the program.";
    _getch(); // Pause the program so the user can see the output

    return 0;
}
