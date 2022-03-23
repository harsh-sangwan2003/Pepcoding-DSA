// Time - O(2^n)
// Space - O(n)

import java.util.Scanner;

public class recursive {

    public static int fib(int n) {

        if (n <= 1)
            return n;

        int n_1 = fib(n - 1);
        int n_2 = fib(n - 2);

        return n_1 + n_2;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = fib(n);

        System.out.println(ans);

        scn.close();
    }
}