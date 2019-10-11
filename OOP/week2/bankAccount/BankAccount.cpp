#include "BankAccount.h"



BankAccount::BankAccount()
{
}
BankAccount::BankAccount(const unsigned long an, const std::string name)
{
	this->accountNumber = an;
	this->customerName = name;
	this->balance = 0;
}
BankAccount::~BankAccount()
{
}

int BankAccount::getBalance() const
{
	return balance;
}
void BankAccount::deposit(const int amount)
{
	balance += amount;
}
