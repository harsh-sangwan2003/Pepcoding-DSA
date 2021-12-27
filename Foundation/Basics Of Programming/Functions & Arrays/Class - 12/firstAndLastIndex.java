import java.util.Scanner;

public class firstAndLastIndex {

    public static int firstIndex(int[] arr, int x) {

        int lo = 0;
        int hi = arr.length - 1;
        int pans = -1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == x) {

                pans = mid;
                hi = mid - 1;
            }

            else if (arr[mid] > x) {

                hi = mid - 1;
            }

            else {

                lo = mid + 1;
            }
        }

        return pans;
    }

    public static int lastIndex(int[] arr, int x) {

        int lo = 0;
        int hi = arr.length - 1;
        int pans = -1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == x) {

                pans = mid;
                lo = mid + 1;
            }

            else if (arr[mid] > x) {

                hi = mid - 1;
            }

            else {

                lo = mid + 1;
            }
        }

        return pans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int x = scn.nextInt();

        System.out.println(firstIndex(arr, x));
        System.out.println(lastIndex(arr, x));
        scn.close();
    }
}
