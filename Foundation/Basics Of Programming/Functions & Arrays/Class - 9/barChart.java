import java.util.Scanner;

public class barChart {

    public static int maximum(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
            max = Math.max(max, arr[i]);

        return max;
    }

    public static void pattern(int[] arr) {

        int max = maximum(arr);

        for (int i = max; i >= 1; i--) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] >= i) {

                    System.out.print("*\t");
                }

                else {

                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();
        }

        pattern(arr);
        scn.close();
    }
}
