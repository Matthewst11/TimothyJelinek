/*
Timothy Jelinek
CS 310
05/16/2024

Fixed two intentional errors in program


*/

#include <iostream>
#include <conio.h>

int main() {
    int *ptr = nullptr;
    int val = 10;

    ptr = &val;
    std::cout << "Value: " << *ptr << std::endl;

    delete ptr; 

    _getch();
    return 0;
}

