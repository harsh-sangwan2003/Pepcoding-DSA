import java.util.Scanner;

public class stair_min_moves_memo {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        Integer[] dp = new Integer[n + 1];
        Integer ans = minMoves(0, n, arr, dp);

        System.out.println(ans);

        scn.close();
    }

    public static Integer minMoves(int src, int dest, int[] arr, Integer[] dp) {

        if (src == dest)
            return dp[src] = 0;

        if (dp[src] != null)
            return dp[src];

        int min = Integer.MAX_VALUE;

        for (int jump = 1; jump <= arr[src] && jump + src <= dest; jump++) {

            Integer call = minMoves(src + jump, dest, arr, dp);

            if (call != null)
                min = Math.min(min, call);
        }

        if (min != Integer.MAX_VALUE)
            return dp[src] = min + 1;

        else
            return dp[src] = null;
    }

}