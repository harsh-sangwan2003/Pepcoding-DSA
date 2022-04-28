//Time - O(a.length+b.length)
//Space - O(a.length+b.length)

import java.util.*;

public class merge_sorted_arrays {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {

        int i = 0, j = 0, k = 0;
        int n = a.length;
        int m = b.length;

        int[] ans = new int[n + m];

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {

                ans[k] = a[i];
                i++;
            }

            else {

                ans[k] = b[j];
                j++;
            }

            k++;
        }

        while (i < a.length) {

            ans[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {

            ans[k] = b[j];
            j++;
            k++;
        }

        return ans;

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }

        int[] mergedArray = mergeTwoSortedArrays(a, b);
        print(mergedArray);

        scn.close();
    }

}