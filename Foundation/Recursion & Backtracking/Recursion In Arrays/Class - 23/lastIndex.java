import java.util.Scanner;

public class lastIndex {

    public static int findIndex(int[] arr, int idx, int x) {

        if (idx == arr.length)
            return -1;

        int rres = findIndex(arr, idx + 1, x);

        if (rres == -1 && arr[idx] == x)
            return idx;

        else
            return rres;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int x = scn.nextInt();
        System.out.println(findIndex(arr, 0, x));
        scn.close();
    }
}
