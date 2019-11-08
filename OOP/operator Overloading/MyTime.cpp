#include "MyTime.h"



MyTime::MyTime() : secs(0), mins(0), hours(0)
{
}
MyTime::MyTime(int secs, int mins, int hours) : secs(secs), mins(mins), hours(hours){}

MyTime::~MyTime()
{
}
MyTime& MyTime::operator=(const MyTime& rhs)
{
	if (this != &rhs) {
		secs = rhs.secs;
		mins = rhs.mins;
		hours = rhs.hours;
	}
	return *this;
}
const MyTime MyTime::operator+(const int seconds) const
{
	const MyTime rTime(secs + seconds, mins, hours);
	return rTime;
}
const MyTime MyTime::operator+(const MyTime& rhs) const
{
	const MyTime rTime(rhs.secs + secs, rhs.mins + mins, rhs.hours + hours);
	return rTime;
}
bool MyTime::operator<(const MyTime& rhs) const
{
	const int time1 = secs + mins * 60 + hours * 60 * 60;
	const int time2 = rhs.secs + rhs.mins * 60 + rhs.hours * 60 * 60;
	return (time1 < time2);
}
bool MyTime::operator>=(const MyTime& rhs) const
{
	const int time1 = secs + mins * 60 + hours * 60 * 60;
	const int time2 = rhs.secs + rhs.mins * 60 + rhs.hours * 60 * 60;
	return (time1 >= time2);
}
bool MyTime::operator==(const MyTime& rhs) const
{
	return (secs == rhs.secs && mins == rhs.mins && hours == rhs.hours);
}
bool MyTime::operator!=(const MyTime& rhs) const
{
	return ((secs != rhs.secs && mins != rhs.mins && hours != rhs.hours));
}
MyTime& MyTime::operator+=(const MyTime& rhs)
{
	secs = secs + rhs.secs;
	mins = mins + rhs.mins;
	hours = hours + rhs.hours;
	return *this;
}
MyTime& MyTime::operator++()
{
	hours + 1;
	return *this;
}
const MyTime MyTime::operator++(int)
{

}
