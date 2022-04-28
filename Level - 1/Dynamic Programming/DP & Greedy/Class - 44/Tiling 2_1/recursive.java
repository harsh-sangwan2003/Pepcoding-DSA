//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class recursive {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = countWays(n);
        System.out.println(res);

        scn.close();
    }

    public static int countWays(int n) {

        if (n <= 2)
            return n;

        int n_1 = countWays(n - 1);
        int n_2 = countWays(n - 2);

        return n_1 + n_2;
    }
}