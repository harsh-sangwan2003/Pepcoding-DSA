//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class memoised {

    public static int numDecodings(String s) {

        int n = s.length();
        int[] dp = new int[n + 1];

        return helper(s, n, dp);
    }

    public static int helper(String s, int n, int[] dp) {

        if (n == 0)
            return dp[n] = 1;

        if (dp[n] != 0)
            return dp[n];

        int count = 0;
        if (s.charAt(n - 1) != '0')
            count += helper(s, n - 1, dp);

        if (n - 1 > 0) {

            int val2 = s.charAt(n - 1) - '0';
            int val1 = s.charAt(n - 2) - '0';
            int val = val1 * 10 + val2;

            if (val >= 10 && val <= 26)
                count += helper(s, n - 2, dp);
        }

        return dp[n] = count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        int res = numDecodings(str);

        System.out.println(res);

        scn.close();
    }
}