package Extra;

import java.util.Scanner;

public class max_min_2 {

    public static int[] max_min(int[] arr) {

        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        int fmin = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > fmax) {

                smax = fmax;
                fmax = arr[i];
            }

            else if (arr[i] > smax) {

                smax = arr[i];
            }

            if (arr[i] < fmin) {

                smin = fmin;
                fmin = arr[i];
            }

            else if (arr[i] < smin) {

                smin = arr[i];
            }
        }

        int[] res = { smax, smin };
        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        System.out.println(max_min(arr)[0] + " " + max_min(arr)[1]);
        scn.close();
    }
}