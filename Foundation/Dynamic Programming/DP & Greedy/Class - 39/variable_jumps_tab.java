import java.util.Scanner;

public class variable_jumps_tab {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int[] dp = new int[n + 1];
        int ans = countPaths(0, n, arr, dp);
        System.out.println(ans);

        scn.close();
    }

    public static int countPaths(int SRC, int dest, int[] arr, int[] dp) {

        for (int src = dp.length - 1; src >= 0; src--) {

            if (src == dest) {
                dp[src] = 1;
                continue;
            }

            int count = 0;

            for (int jump = 1; jump + src <= dest && jump <= arr[src]; jump++) {

                count += dp[src + jump];
            }

            dp[src] = count;
        }

        return dp[0];
    }

}