import java.util.Scanner;

public class firstIndex {

    public static int findIndex(int[] arr, int idx, int x) {

        if (idx == arr.length - 1) {
            return -1;
        }

        if (arr[idx] == x)
            return idx;

        return findIndex(arr, idx + 1, x);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        System.out.println(findIndex(arr, 0, x));
        scn.close();
    }
}