#include<stdio.h>
#include<math.h>
// we will solve here for 
// 20x+y-2z = 17
// 20y+3x-z = -18
// 20z+2x-3y = 25
#define f1(x,y,z) (17-y+(2*z))/20
#define f2(x,y,z) (-18-(3*x)+z)/20
#define f3(x,y,z) (25-(2*x)+(3*y))/20
int main()
{
    float x_=0, y_=0, z_=0, e1,e2,e3,e,x1,y1,z1;
    int count =1;
    printf("enter the tolerable error\n");
    scanf("%f", &e);
    printf("count\tx\ty\tz\n");
    do
    {
         x1 = f1(x_,y_,z_);
         y1 = f2(x1,y_,z_);
         z1 = f3(x1,y1,z_);
         printf("%d\t%0.4f\t%0.4f\t%0.4f\n", count,x1,y1,z1);
        
         e1 = fabs(x_-x1);
         e2 = fabs(y_-y1);
         e3 = fabs(z_-z1);
         count+=1;

         x_=x1;
         y_=y1;
         z_=z1;
        
    } while (e1>e && e2>e && e3>e);
    printf("solution x = %0.3f, y = %0.3f, and z = %0.3f\n", x1, y1, z1);
    return 0;
     
}