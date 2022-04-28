import java.util.Scanner;

public class brokenEconomy {

    public static void binarySearch(int[] arr, int x) {

        int lo = 0;
        int hi = arr.length - 1;

        int ceil = -1;
        int floor = -1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == x) {

                ceil = arr[mid];
                floor = arr[mid];
                break;
            }

            else if (arr[mid] < x) {

                floor = arr[mid];
                lo = mid + 1;
            }

            else {

                ceil = arr[mid];
                hi = mid - 1;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int x = scn.nextInt();
        binarySearch(arr, x);
        scn.close();
    }
}
