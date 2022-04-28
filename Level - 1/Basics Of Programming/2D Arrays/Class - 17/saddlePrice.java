import java.util.Scanner;

public class saddlePrice {

    public static void findSaddle(int[][] arr) {

        for (int row = 0; row < arr.length; row++) {

            int pcol = minimumInRow(arr[row]);
            boolean flag = true;

            for (int r = 0; r < arr.length; r++) {

                if (r != pcol && arr[r][pcol] > arr[row][pcol]) {

                    flag = false;
                    break;
                }
            }

            if (flag) {

                System.out.println(arr[row][pcol]);
                return;
            }
        }

        System.out.println("Invalid input");
    }

    public static int minimumInRow(int[] arr) {

        int min = Integer.MAX_VALUE;
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = Math.min(arr[i], min);
                idx = i;
            }
        }

        return idx;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        findSaddle(arr);
        scn.close();
    }
}