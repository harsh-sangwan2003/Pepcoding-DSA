//Time - O(n)
//Space - O(1)

import java.util.Scanner;

public class paint_house {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 3; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        int res = minCost(arr);
        System.out.println(res);

        scn.close();
    }

    public static int minCost(int[][] arr) {

        for (int i = 1; i < arr.length; i++) {

            arr[i][0] += Math.min(arr[i - 1][1], arr[i - 1][2]);
            arr[i][1] += Math.min(arr[i - 1][0], arr[i - 1][2]);
            arr[i][2] += Math.min(arr[i - 1][0], arr[i - 1][1]);
        }

        int n = arr.length - 1;

        return Math.min(arr[n][0], Math.min(arr[n][1], arr[n][2]));
    }
}