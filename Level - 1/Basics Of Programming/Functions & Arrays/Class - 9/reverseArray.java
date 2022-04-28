import java.util.Scanner;

public class reverseArray {

    public static void swap(int[] arr, int lo, int hi) {

        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
    }

    public static void reverse(int[] arr) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {

            swap(arr, lo, hi);
            lo++;
            hi--;
        }
    }

    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        reverse(arr);
        display(arr);
        scn.close();
    }
}
