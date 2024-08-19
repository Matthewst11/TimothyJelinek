// Author: Timothy Jelinek
// Date: 5/4/2024
// Description of the file
// This file initializes a BankAccount object and prints the details of the bank account

#include <iostream>
#include <conio.h> // Needed for _getch()
#include <iomanip>
#include <string>

using namespace std;

class BankAccount {
private:
    static int nextAccountNumber;
    int accountNumber;
    std::string accountHolderName;
    std::string accountType;
    double balance;
    double interestRate;


public:
    BankAccount(const std::string& name, const std::string& type, double initialBalance, double rate):
    accountNumber(nextAccountNumber++), accountHolderName(name), accountType(type), balance(initialBalance), interestRate(rate) {}

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            cout << "Insufficient funds.\n";
            return;
        } else {
            balance -= amount;
        }
    }

    double getBalance() const {
        return balance;
    }

    void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }

    void displayAccountInfo() const {
        cout << "Account Number: " << accountNumber << endl;
        cout << "Account Holder Name: " << accountHolderName << endl;
        cout << "Account Type: " << accountType << endl;
        cout << "Balance: " << balance << endl;
        cout << "Interest Rate: " << interestRate << endl;
    }
};

int BankAccount::nextAccountNumber = 1000;

int main() {
    // BankAccount savings("Matthew Flowers", "Savings", 1200, 0.02);
    // savings.deposit(700);
    // savings.withdraw(100);
    // savings.computeInterest();

    BankAccount accounts[10] = {
        BankAccount("Matthew Flowers", "Savings", 1200, 0.02),
        BankAccount("Michael Turner", "Checking", 900, 0.005),
        BankAccount("Michael Scott", "Checking", 12000, 0.07),
        BankAccount("Julie Stewart", "Savings", 1000, 0.06),
        BankAccount("Ryan Gosling", "Savings", 20500, 0.10),
        BankAccount("Aaron Rodgers", "Checking", 1000000, 0.05),
        BankAccount("Donald Driver", "Checking", 250000, 0.12),
        BankAccount("Brett Favre", "Savings", 15000, 0.10),
        BankAccount("Christian Watson", "Checking", 2000, 0.03),
        BankAccount("Bart Starr", "Savings", 230, 0.09)
    };

    accounts[2].deposit(250);
    accounts[5].withdraw(100);
    accounts[7].computeInterest();

    std::cout <<"Account Details:\n";
    for (const auto& account : accounts) {
        account.displayAccountInfo();
        cout << "\n";
    }

    // std::cout << "Account Details:\n";
    // savings.displayAccountInfo();

    cout << "\nPress any key to exit the program.";
    getch(); // Pause the program so the user can see the output

    return 0;
}