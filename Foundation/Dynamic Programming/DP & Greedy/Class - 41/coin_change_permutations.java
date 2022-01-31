import java.util.Scanner;

public class coin_change_permutations {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int amt = scn.nextInt();

        int res = coinPermutations(arr, amt);
        System.out.println(res);
        scn.close();
    }

    public static int coinPermutations(int[] arr, int amt) {

        int[] dp = new int[amt + 1];
        dp[0] = 1;

        for (int i = 0; i < dp.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i - arr[j] >= 0)
                    dp[i] += dp[i - arr[j]];
            }
        }

        return dp[dp.length - 1];
    }
}