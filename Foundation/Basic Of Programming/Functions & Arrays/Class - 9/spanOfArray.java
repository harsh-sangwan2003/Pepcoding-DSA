import java.util.Scanner;

public class spanOfArray {

    public static Scanner scn = new Scanner(System.in);

    public static void takeInput(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
    }

    public static int span(int[] arr) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }

        int span = max - min;

        return span;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        takeInput(arr);

        System.out.println(span(arr));

        scn.close();
    }
}