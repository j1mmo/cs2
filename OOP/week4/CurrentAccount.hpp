#pragma once
#include "BankAccount.h"
class CurrentAccount :
	public BankAccount
{
public:
	CurrentAccount(unsigned long number, string name, int balance);
	CurrentAccount();
	virtual bool withdraw(int amount);  // positive amount in pence - returns true if successful
	virtual bool deposit(int amount); // positive amount in pence - returns true if successful
	~CurrentAccount();
};

