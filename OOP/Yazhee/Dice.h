#pragma once
#include <random>
class Dice
{
public:
	Dice();
	int getDiceFace() const;
	bool isHeld() const;
	void setHeld(const bool);
	void roll();
	~Dice();
private:
	int diceNumber;
	bool held;
};
inline Dice::Dice()
{
	diceNumber = (rand() % 6) + 1;
	held = false;
}
inline Dice::~Dice()
{

}
inline int Dice::getDiceFace() const
{
	return diceNumber;
}
inline void Dice::setHeld(const bool T)
{
	held = T;
}
inline bool Dice::isHeld() const
{
	return held;
}
inline void Dice::roll()
{
	diceNumber = (rand() % 6)+1;
}
