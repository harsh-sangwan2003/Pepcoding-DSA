/* To integrate numerically using Simpson's rule */
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define threeByEight 0.375

/* Mathematical function definition */
#define f(x) (1 / (1 + x));

/* Start of main () */

int main () {
    system("cls");
    float lowerBoundary, upperBoundary, stripWidth;
    int stepSize;

    printf ("Simpson's 3 / 8 rule implementation:\n");
    printf ("\nf(x) = 1 / x\n");

    printf ("\nInput values of Lower boundary, Upper boundary & Width of the strip:\n");
    
    printf ("\nLower boundary (a) --> "); scanf ("%f", &lowerBoundary);
    printf ("Upper boundary (b) --> "); scanf ("%f", &upperBoundary);
    printf ("Strip width    (h) --> "); scanf ("%f", &stripWidth);

    stepSize = ((upperBoundary - lowerBoundary) / stripWidth);
    if (stepSize & 1) {
        printf ("\nCalculated step size as per given input is Odd (n = %d) !\n", stepSize);
        stepSize += 1;
        stripWidth = ((upperBoundary - lowerBoundary) / stepSize);

        printf ("\nRefined value of step size (n)  : %d", stepSize);
        printf ("\nRefined value of strip width (h): %d", stripWidth);
    }

    float *x = (float *)calloc((stepSize + 1), sizeof(float));
    float *Y = (float *)calloc((stepSize + 1), sizeof(float));

    printf ("\nThe values of f(x) for different values of x are given below:\n");
    printf ("\n");

    for (int i = 0; i <= stepSize; i++) {
        *(x + i) = (lowerBoundary + (i * stripWidth));
        *(Y + i) = f((*(x + i)));
        printf ("x = %2.2f, f(x) = %.5f\n", *(x + i), *(Y + i));
    }

    float sumOfRest = 0.0, sumOfThree = 0.0;
    for (int i = 1; i < stepSize; i++) { (i % 3) ? (sumOfRest += (*(Y + i))) : (sumOfThree += (*(Y + i))); }
    float solution = ((stripWidth * threeByEight) * ((*(Y)) + (2 * sumOfThree) + (3 * sumOfRest) + (*(Y + stepSize))));

    printf ("\nFinal result of integration is = %f\n", solution);
    
    return 0;
}

/* End of main () */