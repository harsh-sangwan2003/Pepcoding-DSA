//Time - O(n)
//Space - O(1)

import java.util.Scanner;

public class max_sum_non_adjacent {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int res = maxSum(arr);
        System.out.println(res);

        scn.close();
    }

    public static int maxSum(int[] arr) {

        int oldInc = arr[0];
        int oldExc = 0;

        for (int i = 1; i < arr.length; i++) {

            int newInc = oldExc + arr[i];
            int newExc = Math.max(oldInc, oldExc);

            oldInc = newInc;
            oldExc = newExc;
        }

        return Math.max(oldInc, oldExc);
    }
}