import java.util.Scanner;

public class max_of_array {

    public static int max(int[] arr, int idx) {

        if (idx == arr.length - 1)
            return arr[idx];

        int res = max(arr, idx + 1);

        return Math.max(arr[idx], res);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int ans = max(arr, 0);
        System.out.println(ans);
        scn.close();
    }
}