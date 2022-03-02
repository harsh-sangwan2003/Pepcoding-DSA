import java.util.Scanner;
import java.util.Arrays;

public class memoised {

    static int mod = (int) (19e+7);

    public static int numDecodings(String s) {

        int n = s.length();
        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return numDecodings(s, 0, n, dp);
    }

    public static int numDecodings(String s, int idx, int n, int[] dp) {

        if (idx == s.length())
            return dp[idx] = 1;

        if (dp[idx] != -1)
            return dp[idx];

        int count = 0;

        if (s.charAt(idx) != '0') {

            if (s.charAt(idx) == '*') {

                count = (count + 9 * numDecodings(s, idx + 1, n, dp) % mod) % mod;

                if (idx < n - 1) {

                    char ch = s.charAt(idx + 1);

                    if (ch != '*' && ch >= '0' && ch <= '6')
                        count = (count + 2 * numDecodings(s, idx + 2, n, dp) % mod) % mod;

                    else if (ch != '*' && ch >= '7')
                        count = (count + numDecodings(s, idx + 2, n, dp) % mod) % mod;

                    else
                        count = (count + 15 * numDecodings(s, idx + 2, n, dp) % mod) % mod;
                }
            }

            else {

                count = (count + numDecodings(s, idx + 1, n, dp) % mod) % mod;

                if (idx < n - 1) {

                    char ch = s.charAt(idx + 1);

                    if (ch != '*') {

                        int val1 = s.charAt(idx) - '0';
                        int val2 = s.charAt(idx + 1) - '0';
                        int val = val1 * 10 + val2;

                        if (val >= 10 && val <= 26)
                            count = (count + numDecodings(s, idx + 2, n, dp) % mod) % mod;
                    }

                    else if (ch == '*' && s.charAt(idx) == '1')
                        count = (count + 9 * numDecodings(s, idx + 2, n, dp) % mod) % mod;

                    else if (ch == '*' && s.charAt(idx) == '2')
                        count = (count + 6 * numDecodings(s, idx + 2, n, dp) % mod) % mod;

                }
            }
        }

        return dp[idx] = count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int ans = numDecodings(str);
        System.out.println(ans);

        scn.close();
    }
}