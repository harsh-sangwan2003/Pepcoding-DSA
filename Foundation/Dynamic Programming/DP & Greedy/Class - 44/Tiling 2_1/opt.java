//Time- O(n)
//Space- O(1)

import java.util.Scanner;

public class opt {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ways = tiling(n);

        System.out.println(ways);

        scn.close();
    }

    public static int tiling(int n) {

        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {

            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}