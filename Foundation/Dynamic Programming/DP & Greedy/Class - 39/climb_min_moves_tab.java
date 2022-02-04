//Time -O(n^2)
//Space -O(n)

import java.util.Scanner;

public class climb_min_moves_tab {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        Integer[] dp = new Integer[n + 1];
        Integer res = minMoves(0, n, arr, dp);
        System.out.println(res);

        scn.close();
    }

    public static Integer minMoves(int SRC, int dest, int[] arr, Integer[] dp) {

        for (int src = dp.length - 1; src >= 0; src--) {

            if (src == dest) {
                dp[src] = 0;
                continue;
            }

            Integer moves = 0;
            int temp = Integer.MAX_VALUE;

            for (int jump = 1; jump <= arr[src] && jump + src <= dest; jump++) {

                Integer call = dp[src + jump];

                if (call != null)
                    temp = Math.min(temp, call);
            }

            if (temp == Integer.MAX_VALUE)
                moves = null;

            else
                moves = 1 + temp;

            dp[src] = moves;
        }

        return dp[0];
    }

}