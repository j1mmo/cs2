#include "BankAccount.h"

BankAccount::BankAccount(unsigned long accountNumber, string accountName, int balance)
{
	// These should be done as class initialisers, but we'll discuss this later
	this->accountNumber = accountNumber;
	this->accountName = accountName;
	this->balance = balance;
}

BankAccount::~BankAccount() {}
bool BankAccount::deposit(int amount)
{
	balance += amount;
	return true;
}
BankAccount::BankAccount()
{
	accountNumber = -1;
	accountName = "";
	balance = 0;
}
const string BankAccount::getAccountName() const
{
	return accountName;
}

int BankAccount::getBalance() const
{
	return balance;
}
void BankAccount::printSummary() const
{
	const int pounds = balance / 100;
	const int pence = balance - (pounds * 100);

	cout << "\n" << accountName << "\n";
	for (unsigned int i = 0; i < accountName.length(); i++)
		cout << "-";
	cout << "\n";
	cout << "Account Number: " << accountNumber << "\n";
	cout << "Balance: \x9C" << pounds << ".";
	if (pence < 10)
		cout << "0";
	cout << pence << "\n\n";
}
void BankAccount::setAccountName(string name)
{
	accountName = name;
}
void BankAccount::setAccountNumber(unsigned long accno)
{
	accountNumber = accno;
}
void BankAccount::changeBalance(int amt)
{
	balance += amt;
}

bool BankAccount::withdraw(int amount)
{
	if (balance >= amount)
	{
		balance -= amount;
		return true;
	}
	else
		return false;
}
