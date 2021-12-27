import java.util.Scanner;

public class binarySearch {

    public static int search(int[] arr, int x) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == x)
                return mid;

            else if (arr[mid] > x)
                hi = mid - 1;

            else
                lo = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int x = scn.nextInt();
        int idx = search(arr, x);

        System.out.println(idx);
        scn.close();
    }
}