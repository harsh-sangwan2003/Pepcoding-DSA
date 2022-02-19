//TIme - O(n)
//Space - O(1)

import java.util.Scanner;

public class tabulation {

    public static int minCostClimbingStairs(int[] cost) {

        for (int i = 2; i < cost.length; i++) {

            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }

        int n = cost.length;

        return Math.min(cost[n - 1], cost[n - 2]);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] cost = new int[n];

        for (int i = 0; i < n; i++)
            cost[i] = scn.nextInt();

        int ans = minCostClimbingStairs(cost);

        System.out.println(ans);

        scn.close();
    }
}