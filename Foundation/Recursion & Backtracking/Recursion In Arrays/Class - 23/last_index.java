import java.util.Scanner;

public class last_index {

    public static int find(int[] arr, int idx, int target) {

        if (idx == arr.length)
            return -1;

        int res = find(arr, idx + 1, target);

        if (res == -1 && arr[idx] == target)
            return idx;

        else
            return res;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int target = scn.nextInt();

        int idx = find(arr, 0, target);
        System.out.println(idx);
        scn.close();
    }
}