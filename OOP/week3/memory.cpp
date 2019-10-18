#include <iostream>
#include <crtdbg.h>
int* DetermineBallBuckets(const int noofballs, const int nooflevels);
int main()
{
#ifdef _DEBUG
	//  _CrtSetBreakAlloc(87);
	_onexit(_CrtDumpMemoryLeaks);
#endif

	// start coding here
	int nBalls = 0, nLevel = 0;
	std::cout << "Enter the number of balls: ";
	do {
		std::cin >> nBalls;
	} while (nBalls <= 0);
	std::cout << "Enter the number of levels: ";
	do {
		std::cin >> nLevel;
	} while (nLevel <= 0);
	int nBucket = nLevel + 1;
	int * balls = (int*)malloc(sizeof(int)*nBalls);
	for (int i = 0; i < nBalls; i++) {
		balls[i] = 0;
		for (int j = 0; j < nLevel; j++) {
			if (rand() % 2) {
				balls[i]++;
			}
		}
	}
	for (int i = 0; i < nBalls; i++) {
		std::cout << "ball " << i << " fell into bucket " << balls[i] << std::endl;
	}
	free(balls);
	system("pause");
	return 0;
}
int* DetermineBallBuckets(const int noofballs, const int nooflevels)
{
	return (int*)malloc(sizeof(int)*noofballs);
}
