// Author: Timothy Jelinek
// Date: 4/18/2024
// Description: This program has an enum that lists the alphabet and then says the best letter is 'N' and prints it as the best letter.

#include <iostream>
#include <conio.h>
 
using namespace std;

enum class Letter {
    A = 'A', 
    B = 'B', 
    C = 'C', 
    D = 'D', 
    E = 'E', 
    F = 'F',
    G = 'G',
    H = 'H',
    I = 'I',
    J = 'J',
    K = 'K',
    L = 'L',
    M = 'M',
    N = 'N',
    O = 'O'
    P = 'P',
    Q = 'Q',
    R = 'R',
    S = 'S',
    T = 'T',
    U = 'U',
    V = 'V',
    W = 'W',
    X = 'X',
    Y = 'Y',
    Z = 'Z'
};

int main() {
    // Variable
    Leter bestLetter = Letter::N;

    // This calls the letter states that the letter 'N' linked to bestLetter is the best letter
    cout << "The best letter of the alphabet is " << static_cast<char>(bestLetter) << endl;

    cout << "\nPress any key to exit the program.";
    _getch(); // pause the program so the user can see the output

    return 0;
}