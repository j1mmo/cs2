#include <iostream>
#include <string>
#include "BankAccount.h"

using namespace std;

#define MENU_EXIT           0
#define MENU_VIEW_SUMMARY   1
#define MENU_DEPOSIT        2
#define MENU_WITHDRAW       3

#define FIRST_MENU_ITEM     MENU_EXIT
#define LAST_MENU_ITEM      MENU_WITHDRAW

void displayMenu();
int getMenuChoice();
void viewSummary(const BankAccount& account);
void deposit(BankAccount& account);
void withdraw(BankAccount& account);

int main()
{
	BankAccount account = { 101, "Mike Meredith"};

	int choice;
	do
	{
		displayMenu();
		choice = getMenuChoice();

		switch (choice)
		{
		case MENU_VIEW_SUMMARY: viewSummary(account); break;
		case MENU_DEPOSIT: deposit(account); break;
		case MENU_WITHDRAW: withdraw(account); break;
		}

	} while (choice != MENU_EXIT);

	return 0;
}

void displayMenu()
{
	cout << "\nBank Account Manager\n";
	cout << "====================\n";
	cout << MENU_VIEW_SUMMARY << ") View Account Summary\n";
	cout << MENU_DEPOSIT << ") Make deposit\n";
	cout << MENU_WITHDRAW << ") Make withdraw\n";
	cout << MENU_EXIT << ") Exit\n";
}

int getMenuChoice()
{
	int choice;
	cout << "Choose option: ";
	cin >> choice;
	while (choice<FIRST_MENU_ITEM || choice>LAST_MENU_ITEM)
	{
		cout << "Invalid option.  Choose option: ";
		cin >> choice;
	}
	return choice;
}

void viewSummary(const BankAccount& account)
{
	const int pounds = account.getBalance / 100;
	const int pence = account.getBalance - (pounds * 100);

	cout << "\nAccount Summary\n";
	cout << "---------------\n";
	cout << account.getName << "\n";
	cout << "----\n";
	cout << "Balance: \x9C" << pounds << ".";
	if (pence < 10)
		cout << "0";
	cout << pence << "\n\n";
}

void deposit(BankAccount& account)
{
	double amount;
	cout << "\nMake a deposit\n";
	cout << "--------------\n";
	cout << "Enter amount to deposit \x9C";
	cin >> amount;

	account.deposit((int)(amount * 100));
}

void withdraw(BankAccount& account)
{
	double amount;
	cout << "\nWithdraw funds\n";
	cout << "--------------\n";
	cout << "Enter amount to withdraw \x9C";
	cin >> amount;

	int tmp = (int)(amount * 100);
	if (tmp <= account.getBalance())
		account.deposit(-tmp);
	else
		cout << "\n** Not enough funds to withdraw requested amount **\n";
}
