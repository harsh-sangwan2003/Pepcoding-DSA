#include<bits/stdc++.h>
#define ERROR 0.001
using namespace std;

double calculate(double x)
{
	return 3*x*x*x - 4*x*x + 5*x + 2;
}

double derivative(double x)
{
	return 9*x*x - 8*x + 5;
}

void newtonRaphson(double x)
{
	double h = calculate(x) / derivative(x);
	while (abs(h) >= ERROR)
	{
		h = calculate(x)/derivative(x);
		x = x - h;
	}
	cout << "The root is : " << x;
}

int main() 
{
	double x0 = -1;
	newtonRaphson(x0);
	return 0;
}