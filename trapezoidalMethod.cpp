#include<bits/stdc++.h>
using namespace std;

double eqn(double x)
{
    return double((1/(1+x*x)));
}

int main()
{

    double a =0;
    double b =6;
    double ans =0;
    double n = 6;
    cin>>n;
    double h = (b-a)/n;
    ans+=(eqn(a)+eqn(b));
    for(int i=1;i<n;i++)
    {
        ans+=(2*eqn(a+i*h));
    }    
    cout<<"Value of integral is:";
    cout<<fixed<<setprecision(10)<<ans<<endl;
    return 0;
}