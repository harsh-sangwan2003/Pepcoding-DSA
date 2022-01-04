import java.util.Scanner;

public class target_sum_subset {

    public static void targetSubset(int[] arr, int idx, int sos, int target, String ans) {

        if (sos > target)
            return;

        if (idx == arr.length) {

            if (sos == target)
                System.out.println(ans + ".");

            return;
        }

        targetSubset(arr, idx + 1, sos + arr[idx], target, ans + arr[idx] + ", ");
        targetSubset(arr, idx + 1, sos, target, ans);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        targetSubset(arr, 0, 0, target, "");

        scn.close();
    }
}
