//Time -O(n^2)
//Space -O(n)

import java.util.Scanner;

public class climb_min_moves_memo {

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

    public static Integer minMoves(int src, int dest, int[] arr, Integer[] dp) {

        if (src == dest)
            return dp[src] = 0;

        if (dp[src] != null)
            return dp[src];

        Integer moves = 0;
        int temp = Integer.MAX_VALUE;

        for (int jump = 1; jump <= arr[src] && jump + src <= dest; jump++) {

            Integer call = minMoves(src + jump, dest, arr, dp);

            if (call != null)
                temp = Math.min(temp, call);
        }

        if (temp == Integer.MAX_VALUE)
            moves = null;

        else
            moves = 1 + temp;

        return dp[src] = moves;

    }

}