import java.util.Scanner;

public class stair_min_moves {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        Integer[] dp = new Integer[n + 1];
        int ans = minMoves(arr, dp);

        System.out.println(ans);
        scn.close();
    }

    public static int minMoves(int[] arr, Integer[] dp) {

        for (int i = dp.length - 1; i >= 0; i--) {

            if (i == dp.length - 1)
                dp[i] = 0;

            else {

                int min = Integer.MAX_VALUE;

                for (int j = 1; j <= arr[i] && j + i <= arr.length; j++) {

                    if (dp[i + j] != null)
                        min = Math.min(min, dp[i + j]);
                }

                if (min != Integer.MAX_VALUE)
                    dp[i] = min + 1;

                else
                    dp[i] = null;
            }
        }

        return dp[0];
    }

}