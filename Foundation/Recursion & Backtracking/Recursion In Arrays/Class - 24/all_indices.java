import java.util.Scanner;

public class all_indices {

    public static int[] find(int[] arr, int idx, int target, int fsf) {

        if (idx == arr.length - 1)
            return new int[fsf];

        int[] iarr;

        if (arr[idx] == target) {

            iarr = find(arr, idx + 1, target, fsf + 1);
            iarr[fsf] = idx;
        }

        else
            iarr = find(arr, idx + 1, target, fsf);

        return iarr;
    }

    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        int[] ans = find(arr, 0, target, 0);

        if (ans.length == 0) {

            System.out.println("");
            System.exit(0);
        }
        
        display(ans);
        scn.close();
    }
}