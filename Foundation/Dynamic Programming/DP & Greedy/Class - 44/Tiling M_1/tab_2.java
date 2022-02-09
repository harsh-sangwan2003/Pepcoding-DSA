
//Time - O(n)
//Space - O(n)
import java.util.Scanner;

public class tab_2 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] dp = new int[n + 1];

        int ways = tiling(n, m, dp);
        System.out.println(ways);

        scn.close();
    }

    public static int tiling(int n, int m, int[] dp) {

        for (int i = 0; i < dp.length; i++) {

            if (m > i)
                dp[i] = 1;

            else if (m == i)
                dp[i] = 2;

            else {

                dp[i] = dp[i - 1] + dp[i - m];
            }
        }

        return dp[n];

    }

}