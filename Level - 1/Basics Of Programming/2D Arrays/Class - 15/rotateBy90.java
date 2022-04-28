import java.util.Scanner;

public class rotateBy90 {

    public static void rotate(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr[0].length; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int[] d : arr) {

            reverse(d);
        }
    }

    public static void reverse(int[] arr) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }
    }

    public static void display(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
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

        rotate(arr);
        display(arr);
        scn.close();
    }
}
