import java.util.Scanner;

public class subarray {

    public static void findSubarray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        findSubarray(arr);
        scn.close();
    }
}
