//Time - O(n)
//Space - O(1)

import java.util.Scanner;

public class optimised2 {

    public static int board_path(int SP, int ep, int[] dp) {

        int[] arr = new int[7];
        int idx = 0;

        for (int sp = ep; sp >= SP; sp--, idx++) {

            if (ep - sp <= 1) {

                arr[idx] = 1;
            }

            else {

                if (idx < 7) {
                    int val = arr[idx - 1];
                    arr[idx] = 2 * val;
                }

                else {

                    int val1 = arr[(idx - 1) % 7];
                    int val2 = arr[idx % 7];
                    arr[idx % 7] = 2 * val1 - val2;
                }
            }

        }

        return arr[(idx - 1) % 7];
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        int ans = board_path(0, n, dp);

        System.out.println(ans);

        // for (int val : dp)
        // System.out.print(val + " ");

        scn.close();
    }
}