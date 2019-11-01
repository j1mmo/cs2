#pragma once
#include "Dice.h"
#include <iostream>
class Yahtzee
{
public:
	Yahtzee();
	~Yahtzee();
	void play();
private:
	void playset();
	void displayOption();
	void resetDice();
	void displayDice();
	void displayScorecard();
	static int getRangedInput(int, int);
	Dice* dice = new Dice[5];
	int rollCounter;
};
inline Yahtzee::Yahtzee()
{
	rollCounter = 1;
}



inline Yahtzee::~Yahtzee()
{
	delete dice;
	dice = NULL;
}

