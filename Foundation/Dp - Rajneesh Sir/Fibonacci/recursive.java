//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class recursive {

    public static int fibo(int n) {

        if (n <= 1)
            return n;

        int ans = fibo(n - 1) + fibo(n - 2);

        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int res = fibo(n);

        System.out.println(res);

        scn.close();
    }
}