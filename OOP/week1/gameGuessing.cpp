#include <iostream>
#include <stdlib.h>
#include <time.h>

int main()
{
	const int numberOfQuestions = 5;
	srand(time(NULL));
	int answer;
	int correctAnswers = 0;
	int add = 0;
	for (int i = 0; i < numberOfQuestions; i++) {
		int r1 = rand() % 10;
		int r2 = rand() % 10;
		int add = rand()%2;
		std::cout << "What is " << r1;
		std::cout << (add ? " + " : " - ");
		std::cout << r2 << "?\n";
		std::cin >> answer;
		if ((answer == (r1 + r2) && add) || (answer == (r1-r2) && !add)) {
			std::cout << "Correct!\n";
			correctAnswers++;
		}
		else {
			if (add) {
				std::cout << "Incorrect! the answer is " << r1 + r2 << "\n";
			}
			else {
				std::cout << "Incorrect! the answer is " << r1 - r2 << "\n";
			}
			
		}
	}
	std::cout << "You got " << correctAnswers << "out of " << numberOfQuestions << std::endl;
	system("pause");
	return 0;
}
