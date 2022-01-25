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

        int cost = getCost(0, 0, arr);

        System.out.println(cost);
        scn.close();
    }

    public static int getCost(int r, int c, int[][] arr) {

        if (r == arr.length - 1 && c == arr[0].length - 1)
            return arr[r][c];

        int cost = 0;

        if (r + 1 < arr.length && c + 1 < arr[0].length) {
            cost += (arr[r][c] + Math.min(getCost(r + 1, c, arr), getCost(r, c + 1, arr)));
        }

        else if (r + 1 < arr.length) {

            cost += arr[r][c] + getCost(r + 1, c, arr);
        }

        else {

            cost += arr[r][c] + getCost(r, c + 1, arr);
        }

        return cost;
    }

}