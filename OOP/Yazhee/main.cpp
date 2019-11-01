#include <iostream>
#include "Yahtzee.h"
int main()
{
#ifdef _DEBUG
	//  _CrtSetBreakAlloc(87);
	_onexit(_CrtDumpMemoryLeaks);
#endif

	// start coding here
	Yahtzee yahtzee = new yahtzee();
	
	system("pause");
	return 0;

}
