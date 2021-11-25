import java.util.Scanner;

public class pattern_13 {

    public static int factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        int res = 1;

        for (int i = n; i >= 1; i--)
            res *= i;

        return res;
    }

    public static void pattern(int n) {

        int nst = 1;

        for (int r = 0; r < n; r++) {

            for (int cst = 0; cst < nst; cst++) {

                int ans = factorial(r) / (factorial(cst) * factorial(r - cst));
                System.out.print(ans + "\t");
            }

            System.out.println();
            nst++;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pattern(n);
    }
}
