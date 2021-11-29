import java.util.Scanner;

public class theory {

    public static Scanner scn = new Scanner(System.in);

    public static void takeInput(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();
        }
    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] + " ");
        }
    }

    public static boolean findElement(int[] arr, int data) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == data)
                return true;
        }

        return false;
    }

    public static int maximum(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            max = arr[i] > max ? arr[i] : max;
        }

        return max;
    }

    public static int minimum(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            min = arr[i] < min ? arr[i] : min;
        }

        return min;
    }

    public static int firstIndex(int[] arr, int data) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == data)
                return i;
        }

        return -1;
    }

    public static int lastIndex(int[] arr, int data) {

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == data)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = scn.nextInt();
        int[] arr = new int[n];

        takeInput(arr);
        printArray(arr);
        System.out.println(findElement(arr, 20));
        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
        System.out.println(firstIndex(arr, 4));
        System.out.println(lastIndex(arr, 4));
    }
}
