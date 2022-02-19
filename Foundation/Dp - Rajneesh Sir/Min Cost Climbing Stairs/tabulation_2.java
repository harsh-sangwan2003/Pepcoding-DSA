//TIme - O(n)
//Space - O(1)

import java.util.Scanner;

public class tabulation_2 {

    public static int minCostClimbingStairs(int[] cost) {

        int a = cost[0], b = cost[1];

        for (int i = 2; i < cost.length; i++) {

            int c = cost[i] + Math.min(a, b);
            a = b;
            b = c;
        }

        return Math.min(a, b);
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