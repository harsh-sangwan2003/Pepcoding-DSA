import java.util.Scanner;

public class maze_traversal_tab {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        int ans = getCost(arr, dp);

        System.out.println(ans);
        scn.close();
    }

    public static int getCost(int[][] arr, int[][] dp) {

        int n = arr.length;
        int m = arr[0].length;

        for (int r = n - 1; r >= 0; r--) {

            for (int c = m - 1; c >= 0; c--) {

                if (r == n - 1 && c == m - 1)
                    dp[r][c] = arr[r][c];

                else if (r == n - 1)
                    dp[r][c] = arr[r][c] + dp[r][c + 1];

                else if (c == m - 1)
                    dp[r][c] = arr[r][c] + dp[r + 1][c];

                else
                    dp[r][c] = arr[r][c] + Math.min(dp[r + 1][c], dp[r][c + 1]);
            }
        }

        return dp[0][0];
    }

}