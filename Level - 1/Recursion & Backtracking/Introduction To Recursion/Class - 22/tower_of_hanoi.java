//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class tower_of_hanoi {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int t1 = scn.nextInt();
        int t2 = scn.nextInt();
        int t3 = scn.nextInt();

        toh(num, t1, t2, t3);

        scn.close();
    }

    public static void toh(int n, int A, int B, int C) {

        if (n == 0)
            return;

        toh(n - 1, A, C, B);

        System.out.println(n + "[" + A + " -> " + B + "]");

        toh(n - 1, C, B, A);
    }

}