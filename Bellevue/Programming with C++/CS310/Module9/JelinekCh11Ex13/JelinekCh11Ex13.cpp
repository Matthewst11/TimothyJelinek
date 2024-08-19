// Author: Timothy Jelinek
// Date: 5/11/2024
// Description of the file
// This file initializes BankAccount, SavingsAccount, and CheckingAccount classes and allows a user to perform functions on the account

#include <iostream>
#include <conio.h>

using namespace std;

// This class represents a bank account with basic functionalities
class BankAccount {
protected:
    int account_number; // Account number of Bank Account
    double balance; // Balance of Bank Account
public:
    // Constructor to initialize account number and balance
    BankAccount(int account_number, double balance) : account_number(account_number), balance(balance) {}
    // Method to set account number
    void set_account_number(int account_number) {
        this->account_number = account_number;
    }
    // Method to Get account number
    int get_account_number() {
        return account_number;
    }
    // Method to Get Balance
    double get_balance() {
        return balance;
    }
    // Method to deposit an amount into bank account
    void deposit(double amount) {
        balance += amount;
    }
    // Virtual method to withdraw an amount from bank account
    virtual void withdraw(double amount) {
        if (amount > balance) {
            cout << "Insufficient balance!" << std::endl;
        } else {
            balance -= amount;
        }
    };
    // Virtual method to print account information
    virtual void print_account_info() {
        cout << "Account Number: " << account_number << ", Balance: " << balance << std::endl;
    }
};
// This is a CheckingAccount class derived from the BankAccount class
class CheckingAccount : public BankAccount {
private:
    double interest_rate; // Interest rate for checking account
    double minimum_balance; // Minimum balance of the checking account
    double service_charges; // Service charges of the checking account
public:
    // Constuctor to initialize account number, interest rate, minimum balance, and service charges
    CheckingAccount(int account_number, double balance, double interest_rate, double minimum_balance, double service_charges) : BankAccount(account_number, balance), interest_rate(interest_rate), minimum_balance(minimum_balance), service_charges(service_charges) {}
    // Method to set interest rate
    void set_interest_rate(double interest_rate) {
        this->interest_rate = interest_rate;
    }
    // Method to get interest rate
    double get_interest_rate() {
        return interest_rate;
    }
    // Method to set minimum balance
    void set_minimum_balance(double minimum_balance) {
        this->minimum_balance = minimum_balance;
    }
    // Method to get minimum balance
    double get_minimum_balance() {
        return minimum_balance;
    }
    // Method to set service charge
    void set_service_charges(double service_charges) {
        this->service_charges = service_charges;
    }
    // Method to get service charge
    double get_service_charges() {
        return service_charges;
    }
    // Method to post interest
    void post_interest() {
        balance += balance * interest_rate;
    }
    // Method to check if balance is below minimum balance
    bool is_balance_below_minimum() {
        return balance < minimum_balance;
    }
    // Method to write a check
    void write_check(double amount) {
        withdraw(amount);
    }
    // Overriden method to withdraw from checking account
    void withdraw(double amount) override {
        if(amount > balance) {
            cout << "Insufficient balance!" << std::endl;
            balance -= service_charges;
        } else {
            balance -= amount;
        }
    }
    // Overriden method to print account info
    void print_account_info() override {
        BankAccount::print_account_info();
        cout << "Interest Rate: " << interest_rate << ", Minimum Balance: " << minimum_balance << ", Service Charges: " << service_charges << std::endl;
    }
};
// This is a SavingAccount class derived from the BankAccount class
class SavingsAccount : public BankAccount {
private:
    double interest_rate; // Interest rate for savings account
public:
    // Constructor initialize account number, balance, and interest rate
    SavingsAccount(int account_number, double balance, double interest_rate) : BankAccount(account_number, balance), interest_rate(interest_rate) {}
    // Method to set interest rate
    void set_interest_rate(double interest_rate) {
        this->interest_rate = interest_rate;
    }
    // Method to get interest rate
    double get_interest_rate() {
        return interest_rate;
    }
    // Method to post interest to account
    void post_interest() {
        balance += balance * interest_rate;
    }
    // Overriden method to withdraw amoount from savings account
    void withdraw(double amount) override {
        if(amount > balance) {
            cout << "Insufficient balance!" << endl;
        } else {
            balance -= amount;
        } 
    }
    // Overriden method to print account info
    void print_account_info() override {
        BankAccount::print_account_info();
        cout << "Interest Rate: " << interest_rate << std::endl;
    }
};

int main() {
    // Create checking account object with initial values
    CheckingAccount checking_account(123456789, 1000, 0.01, 100, 10);
    // Create savings account object with initial values
    SavingsAccount savings_account(987654321, 1000, 0.02);

    int choice; // Variable to store user choice
    double amount; // Variable to store amount to deposit or withdraw
    // Start infinite loop to interact with user
    while(true) {
        // Print menu with options
        cout << "\n1. Deposit\n2. Withdraw\n3.Compute Interest\n4. Print Account Info.\n5.Exit\nEnter your choice: ";
        // Get user choice
        cin >> choice;
        //Perform operation based on user choice
        switch(choice) {
        case 1: // deposit
            cout << "Enter the amount to deposit: ";
            cin >> amount;
            // deposit amount into both accounts
            checking_account.deposit(amount);
            savings_account.deposit(amount);
            break;
        case 2: // withdraw
            cout << "Enter the amount to withdraw: ";
            cin >> amount;
            // withdraw amount from both account
            checking_account.withdraw(amount);
            savings_account.withdraw(amount);
            break;
        case 3: // compute interest
            // post interest to both accounts
            checking_account.post_interest();
            savings_account.post_interest();
            break;
        case 4: // print account info
            cout << "\nChecking Account Info:\n";
            // print account info for checking
            checking_account.print_account_info();
            cout << "\nSavings Account Info:\n";
            // print account info for savings
            savings_account.print_account_info();
            break;
        case 5: // exit
            return 0;
        default: // invalid choice
            cout << "Invalid choice.  Please try again.\n";
        }
    }

    cout << "\nPress any key to exit the program.";
    _getch(); // Pause the program so the user can see the output
    return 0;
}