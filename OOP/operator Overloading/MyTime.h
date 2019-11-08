#pragma once
class MyTime
{
public:
	MyTime();
	MyTime(int secs, int mins, int hours);
	~MyTime();

	MyTime& operator=(const MyTime& rhs);
	const MyTime operator+(const int seconds) const;
	const MyTime operator+(const MyTime& rhs) const;
	bool operator<(const MyTime& rhs) const;
	bool operator>=(const MyTime& rhs) const;
	bool operator==(const MyTime& rhs) const;
	bool operator!=(const MyTime& rhs) const;
	MyTime& operator+=(const MyTime& rhs);
	MyTime& operator++();
	const MyTime operator++(int);
private:
	unsigned int secs, mins, hours;
};

