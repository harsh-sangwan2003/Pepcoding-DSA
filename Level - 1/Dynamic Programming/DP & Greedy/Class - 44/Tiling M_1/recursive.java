//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class recursive {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int res = countWays(n, m);
        System.out.println(res);

        scn.close();
    }

    public static int countWays(int n, int m) {

        if (m > n)
            return 1;

        else if (m == n)
            return 2;

        return countWays(n - 1, m) + countWays(n - m, m);
    }
}