//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class display_arr_rev {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();
        }

        displayArrReverse(arr, 0);

        scn.close();
    }

    public static void displayArrReverse(int[] arr, int idx) {

        if (idx == arr.length)
            return;

        displayArrReverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }

}