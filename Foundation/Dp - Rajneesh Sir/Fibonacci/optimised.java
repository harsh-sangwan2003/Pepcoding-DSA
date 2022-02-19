//Time - O(n)
//Space - O(1)

import java.util.Scanner;

public class optimised {

    public static int fibo(int n) {

        int a = 0;
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

        int res = fibo(n);

        System.out.println(res);

        scn.close();
    }
}