
//Time - O(n)
//Space - O(n)
import java.util.Scanner;

public class tab_1 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] dp = new int[n + 1];

        int ways = tiling(n, m, dp);
        System.out.println(ways);

        scn.close();
    }

    public static int tiling(int N, int m, int[] dp) {

        for (int n = 1; n < dp.length; n++) {

            if (m > n) {
                dp[n] = 1;
                continue;
            }

            else if (m == n) {
                dp[n] = 2;
                continue;
            }

            dp[n] = dp[n - 1] + dp[n - m];
        }

        return dp[N];

    }

}