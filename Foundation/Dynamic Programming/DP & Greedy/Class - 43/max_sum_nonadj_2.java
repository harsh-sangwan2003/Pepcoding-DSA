//Time - O(n)
//Space - O(1)

import java.util.Scanner;

public class max_sum_nonadj_2 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int ans = maxSumSubset(arr);

        System.out.println(ans);
        scn.close();
    }

    public static int maxSumSubset(int[] arr) {

        int oldexc = 0;
        int oldinc = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int newexc = Math.max(oldinc, oldexc);
            int newinc = arr[i] + oldexc;

            oldinc = newinc;
            oldexc = newexc;
        }

        return Math.max(oldinc, oldexc);
    }
}