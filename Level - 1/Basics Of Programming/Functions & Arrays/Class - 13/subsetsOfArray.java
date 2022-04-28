import java.util.Scanner;

public class subsetsOfArray {

    public static void printSubsets(int[] arr) {

        int end = (int) Math.pow(2, arr.length);

        for (int i = 0; i < end; i++) {

            int temp = i;
            String sb = "";

            for (int j = arr.length - 1; j >= 0; j--) {

                int rem = temp % 2;
                temp /= 2;

                if (rem == 0) {

                    sb = "-" + "\t" + sb;
                }

                else {

                    sb = arr[j] + "\t" + sb;
                }
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        printSubsets(arr);
        scn.close();
    }
}
