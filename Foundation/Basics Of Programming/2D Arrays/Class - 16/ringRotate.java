import java.util.Scanner;

public class ringRotate {

    public static void rotate(int[][] arr, int s, int r) {

        int[] oned = fillUpOned(arr, s);
        rotate(oned, r);
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

        while (idx < size) {

            // Left
            for (int r = minr; r <= maxr; r++) {

                array[idx] = arr[r][minc];
                idx++;
            }
            minc++;

            // Bottom
            for (int c = minc; c <= maxc; c++) {

                array[idx] = arr[maxr][c];
                idx++;
            }
            maxr--;

            // Right
            for (int r = maxr; r >= minr; r--) {

                array[idx] = arr[r][maxc];
                idx++;
            }
            maxc--;

            // Top
            for (int c = maxc; c >= minc; c--) {

                array[idx] = arr[minr][c];
                idx++;
            }
            minr++;
        }

        return array;
    }

    public static void rotate(int[] arr, int r) {

        r = r % arr.length;
        if (r < 0)
            r += arr.length;

        reverse(arr, 0, arr.length - r - 1);
        reverse(arr, arr.length - r, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int lo, int hi) {

        while (lo <= hi) {

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }

    public static void fillUpTwod(int[][] arr, int[] array, int s) {

        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int size = array.length;
        int idx = 0;

        while (idx < size) {

            // Left
            for (int r = minr; r <= maxr; r++) {

                arr[r][minc] = array[idx];
                idx++;
            }
            minc++;

            // Bottom
            for (int c = minc; c <= maxc; c++) {

                arr[maxr][c] = array[idx];
                idx++;
            }
            maxr--;

            // Right
            for (int r = maxr; r >= minr; r--) {

                arr[r][maxc] = array[idx];
                idx++;
            }
            maxc--;

            // Top
            for (int c = maxc; c >= minc; c--) {

                arr[minr][c] = array[idx];
                idx++;
            }
            minr++;
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
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();
        rotate(arr, s, r);
        display(arr);
        scn.close();
    }
}