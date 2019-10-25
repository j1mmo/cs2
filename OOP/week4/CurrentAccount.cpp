#include "CurrentAccount.h"


CurrentAccount::CurrentAccount(unsigned long number, string name, int balance)
{
	setAccountName(name);
	setAccountNumber(number);
	changeBalance(balance);
}
bool CurrentAccount::withdraw(int amount)
{
	const int currentBalance = getBalance();
	if (currentBalance - amount) {
		changeBalance(amount);
		return true;
	}
	return false;
}
bool CurrentAccount::deposit(int amount)
{
	changeBalance(amount);
	return true;
}
CurrentAccount::CurrentAccount()
{
}


CurrentAccount::~CurrentAccount()
{
}
