#include <iostream>
#include <stdlib.h>
#include <time.h>

int main()
{
	srand(time(NULL));
	const int guess = 3;
	int n = (rand() % 10) +1;
	int playerguess = 0;
	for (int i = 0; i < guess && playerguess != n; i++) {
		std::cout << "Guess a number between 1 & 10: ";
		std::cin >> playerguess;
		int temp = n-playerguess;
		if (playerguess != n) {
			std::cout << (temp > 0 ? "too small" : "Too big");
		}
		std::cout << std::endl;
	}
	std::cout << "the answer was, " << n << std::endl;
	system("pause");
}
