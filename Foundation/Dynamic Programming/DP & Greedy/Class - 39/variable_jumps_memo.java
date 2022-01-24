import java.util.Scanner;

public class variable_jumps_memo {

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

    public static int countPaths(int src, int dest, int[] arr, int[] dp) {

        if (src == dest)
            return dp[src] = 1;

        int count = 0;

        for (int jump = 1; jump + src <= dest && jump <= arr[src]; jump++) {

            count += countPaths(src + jump, dest, arr, dp);
        }

        return dp[src] = count;
    }

}