// Time - O(n)
// Space - O(1)

import java.util.Scanner;

public class optimisation {

    public static int fib(int n) {

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {

            int c = a + b;
            a = b;
            b = c;
        }

        return a;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = fib(n);

        System.out.println(ans);

        scn.close();
    }
}