//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class recursive {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ways = tiling(n);
        System.out.println(ways);

        scn.close();
    }

    public static int tiling(int n) {

        if (n <= 2)
            return n;

        int vways = tiling(n - 1);
        int hways = tiling(n - 2);

        return vways + hways;
    }
}