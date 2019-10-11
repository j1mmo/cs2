#pragma once
#include <string>
class BankAccount
{
public:
	BankAccount();
	BankAccount(const unsigned long an, const std::string name);
	~BankAccount();
	int getBalance() const;
	const std::string getName() const { return customerName; };
	void deposit(const int);
private:
	unsigned long accountNumber;
	std::string customerName;
	int balance;  // in pence
};
