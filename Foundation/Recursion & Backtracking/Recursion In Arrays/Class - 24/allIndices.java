import java.util.Scanner;

public class allIndices {

    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static int[] findIndices(int[] arr, int idx, int x, int fsf) {

        if (idx == arr.length)
            return new int[fsf];

        int[] iarr;
        if (arr[idx] == x) {
            iarr = findIndices(arr, idx + 1, x, fsf + 1);
            iarr[fsf] = idx;
        }

        else {

            iarr = findIndices(arr, idx + 1, x, fsf);
        }

        return iarr;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int x = scn.nextInt();

        int[] ans = findIndices(arr, 0, x, 0);

        if (ans.length == 0)
            System.out.println(" ");

        else
            display(ans);
        scn.close();
    }
}
