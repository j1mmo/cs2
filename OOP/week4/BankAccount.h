#pragma once
#include <string>
#include <iostream>
using namespace std;

class BankAccount
{
public:
	BankAccount();
	BankAccount(unsigned long accountNumber, string accountName, int balance);
	virtual ~BankAccount();

	int getBalance() const; // returns balance in pence
	virtual bool withdraw(int amount);  // positive amount in pence - returns true if successful
	virtual bool deposit(int amount); // positive amount in pence - returns true if successful

	void printSummary() const;

	const string getAccountName() const;
protected:
	void setAccountName(string name);
	void setAccountNumber(unsigned long accno);
	void changeBalance(int amt);
private:
	unsigned long accountNumber;
	string accountName;
	int balance;  // in pence
};
