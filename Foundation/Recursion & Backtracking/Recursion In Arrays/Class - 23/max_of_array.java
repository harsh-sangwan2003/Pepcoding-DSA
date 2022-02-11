//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class max_of_array {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int res = maxOfArray(arr, 0);
        System.out.println(res);

        scn.close();
    }

    public static int maxOfArray(int[] arr, int idx) {

        if (idx == arr.length - 1)
            return arr[idx];

        int rres = maxOfArray(arr, idx + 1);

        return Math.max(arr[idx], rres);
    }

}