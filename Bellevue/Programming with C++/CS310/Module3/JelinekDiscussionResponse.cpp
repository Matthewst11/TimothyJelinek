/*
* Student Name: Timothy Jelinek
* File Name: Fixing M3 Discussion; Debugging Assignment
* Date: 3/31/2024 
* 
* This program will take a user's name and year of birth. 
* Then it will let the user know if they are legally able to drink alcohol.
* If not, the program will notify user that the user has not reached the legal drinking age and to check the birthdate. 
* There are two errors!
*/

#include <iostream>
#include <conio.h>
#include <string>

using namespace std; 

int main()
{
    string name; 
    int birthYear, age; 

    cout << "Enter your name: "; 
    cin >> name; 

    cout << "Enter your year of birth: "; 
    cin >> birthYear; 

    //Calculate age. 
    age = 2024 - birthYear; 

    //Adjust age if the user's birthday hasn't passed. 
    int currentMonth = 3; //Current month now. 
    if (currentMonth < 12) {
        age - int(1); //Decrease age by 1 if birthday has not passed. 
    }

    // Check if user is over 21. 
    if (age >= 21)
        cout << "Congratulations, " << name << ", you are over 21 and legally able to drink alcohol. " << endl;
    else
        cout << "Sorry, " << name << ", you are still under legal drinking age and need to wait until you're 21! " << endl; 


    cout << "Press any key to continue..." << endl; 

    _getch(); //Pause the program. 

    return 0; 

}


