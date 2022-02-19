//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class optimised {

    public static int tribonacci(int n) {

        int a = 0, b = 1, c = 1;

        for (int i = 1; i <= n; i++) {

            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int res = tribonacci(n);

        System.out.println(res);

        scn.close();
    }
}