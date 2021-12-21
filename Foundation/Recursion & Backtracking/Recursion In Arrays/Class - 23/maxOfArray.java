import java.util.Scanner;

public class maxOfArray {

    public static int maximum(int[] arr, int idx) {

        if (idx == arr.length - 1)
            return arr[idx];

        int res = maximum(arr, idx + 1);

        return Math.max(arr[idx], res);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        System.out.println(maximum(arr, 0));

        scn.close();
    }
}