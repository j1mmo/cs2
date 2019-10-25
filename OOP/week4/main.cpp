#include <iostream>
#include <crtdbg.h>
#include "CurrentAccount.h"
int main()
{
#ifdef _DEBUG
	//  _CrtSetBreakAlloc(87);
	_onexit(_CrtDumpMemoryLeaks);
#endif

	BankAccount* account = new CurrentAccount(101, "Mike M",21);

	account->printSummary();

	delete account;
	system("pause");
	return 0;
}
