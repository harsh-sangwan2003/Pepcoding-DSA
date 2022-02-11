//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class last_index {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int x = scn.nextInt();
        int lastIdx = lastIndex(arr, 0, x);

        System.out.println(lastIdx);

        scn.close();
    }

    public static int lastIndex(int[] arr, int idx, int x) {

        if (idx == arr.length)
            return -1;

        int rres = lastIndex(arr, idx + 1, x);

        if (rres == -1 && arr[idx] == x)
            return idx;

        else
            return rres;
    }

}