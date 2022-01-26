// Time - O(2^max(n,m))
// Space - O(max(n,m))

import java.util.Scanner;

public class maze_traversal_rec {

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

        int ans = minCost(0, 0, arr);
        System.out.println(ans);

        scn.close();
    }

    public static int minCost(int sr, int sc, int[][] arr) {

        if (sr == arr.length - 1 && sc == arr[0].length - 1)
            return arr[sr][sc];

        int cost = arr[sr][sc];

        if (sr + 1 < arr.length && sc + 1 < arr[0].length)
            cost += Math.min(minCost(sr + 1, sc, arr), minCost(sr, sc + 1, arr));

        else if (sr + 1 < arr.length)
            cost += minCost(sr + 1, sc, arr);

        else
            cost += minCost(sr, sc + 1, arr);

        return cost;
    }

}