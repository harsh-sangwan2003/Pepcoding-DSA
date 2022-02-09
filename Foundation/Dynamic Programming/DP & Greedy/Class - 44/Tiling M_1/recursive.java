//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class recursive {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int ways = tiling(n, m);
        System.out.println(ways);

        scn.close();
    }

    public static int tiling(int n, int m) {

        if (m > n)
            return 1;

        else if (m == n)
            return 2;

        else
            return tiling(n - 1, m) + tiling(n - m, m);

    }
}