import java.util.Scanner;

public class invertedBarChart {

    public static void printChart(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            max = Math.max(arr[i], max);
        }

        for (int r = 1; r <= max; r++) {

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] >= r) {

                    System.out.print("*	");
                }

                else {

                    System.out.print("	");
                }
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        printChart(arr);

        scn.close();
    }
}