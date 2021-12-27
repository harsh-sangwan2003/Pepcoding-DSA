import java.util.Scanner;

public class span_2 {

    public static int maximum(int[] arr) {

        int max = -1;

        for (int i = 0; i < arr.length; i++)
            max = Math.max(arr[i], max);

        return max;
    }

    public static int minimum(int[] arr) {

        int min = (int) (1e9 + 1);

        for (int i = 0; i < arr.length; i++)
            min = Math.min(arr[i], min);

        return min;
    }

    public static int findSpan(int[] arr) {

        int max = maximum(arr);
        int min = minimum(arr);

        int ans = max - min;
        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int res = findSpan(arr);
        System.out.println(res);
        scn.close();
    }
}