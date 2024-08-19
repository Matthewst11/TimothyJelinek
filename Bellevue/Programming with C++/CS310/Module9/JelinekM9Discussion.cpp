// Author: Timothy Jelinek
// Date: 4/29/2024
// Description: This program creates a class named Pet, which then has subclasses of Dog and Cat, which state the emotional status of the Dog and the Cat.

#include <iostream>
#include <conio.h>
#include <string>
 
using namespace std;

class Pet {
public:
    void wagTail() {
        cout << "The tail is wagging." << std::endl;
    }
};

class Dog : public Pet {
public:
    void happy() {
        cout << "The dog is happy." << std::endl;
    }
};

class Cat :public Pet {
public:
    void ad() {
        cout << "The cat is mad." << std::endl;
    }
};

int main() {
    Dog dog;
    dog.wgTail();
    dog.happy();

    Cat cat;
    cat.wagTail();
    cat.mad();
    
    cout << "\nPress any key to exit the program.";
    _getch(); // pause the program so the user can see the output

    return 0;
}