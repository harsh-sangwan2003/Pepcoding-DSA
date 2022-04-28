import java.util.Scanner;

public class inverseOfArray {

    public static int[] inverse(int[] arr) {

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[arr[i]] = i;
        }

        return ans;
    }

    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        arr = inverse(arr);
        display(arr);
        scn.close();
    }
}
