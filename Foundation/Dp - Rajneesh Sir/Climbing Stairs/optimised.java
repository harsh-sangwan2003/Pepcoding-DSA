//TIme - O(n)
//Space - O(1)

import java.util.Scanner;

public class optimised {

    public static int climbStairs(int n) {

        int a = 1;
        int b = 1;

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

        int ans = climbStairs(n);

        System.out.println(ans);

        scn.close();
    }
}