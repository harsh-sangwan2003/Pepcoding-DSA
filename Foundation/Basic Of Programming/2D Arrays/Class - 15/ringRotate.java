import java.util.Scanner;

public class ringRotate {

    public static void shellRotate(int[][] arr, int s, int r) {

        int[] oned = fillUpOned(arr, s);
        rotateArray(oned, r);
        fillUpTwod(arr, oned, s);
    }

    public static int[] fillUpOned(int[][] arr, int s) {

        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int size = 2 * (maxr - minr + maxc - minc);
        int[] array = new int[size];

        int idx = 0;

        while (idx < array.length) {

            // Left
            for (int r = minr; r <= maxr; r++) {

                array[idx] = arr[r][minc];
                idx++;
            }

            // Bottom
            for (int c = minc + 1; c <= maxc; c++) {

                array[idx] = arr[maxr][c];
                idx++;
            }

            // Right
            for (int r = maxr - 1; r >= minr; r--) {

                array[idx] = arr[r][maxc];
                idx++;
            }

            // Top
            for (int c = maxc - 1; c > minc; c--) {

                array[idx] = arr[minr][c];
                idx++;
            }

            // Right

        }

        return array;
    }

    public static void fillUpTwod(int[][] arr, int[] oned, int s) {

        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int idx = 0;

        while (idx < oned.length) {

            // Left
            for (int r = minr; r <= maxr; r++) {

                arr[r][minc] = oned[idx];
                idx++;
            }

            // Bottom
            for (int c = minc + 1; c <= maxc; c++) {

                arr[maxr][c] = oned[idx];
                idx++;
            }

            // Right
            for (int r = maxr - 1; r >= minr; r--) {

                arr[r][maxc] = oned[idx];
                idx++;
            }

            // Top
            for (int c = maxc - 1; c > minc; c--) {

                arr[minr][c] = oned[idx];
                idx++;
            }
        }
    }

    public static void rotateArray(int[] arr, int r) {

        r = r % arr.length;
        if (r < 0)
            r += arr.length;

        reverseArray(arr, 0, arr.length - r - 1);
        reverseArray(arr, arr.length - r, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }

    public static void reverseArray(int[] arr, int lo, int hi) {

        while (lo <= hi) {

            int tmp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = tmp;

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
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();

        shellRotate(arr, s, r);
        display(arr);
        scn.close();
    }
}