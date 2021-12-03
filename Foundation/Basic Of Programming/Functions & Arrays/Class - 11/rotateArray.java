import java.util.Scanner;

public class rotateArray {

    public static void display(int[] arr){

        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i] + " ");

    }

    public static void reverse(int[] arr, int lo, int hi){

        while(lo<=hi){

            int temp = arr[hi];
            arr[hi] = arr[lo];
            arr[lo] = temp;
            hi--;
            lo++;
        }

    }

    public static void rotate(int[] arr, int k){

        k = (k%arr.length + arr.length)%arr.length;
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);

    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        arr[i] = scn.nextInt();

        int k = scn.nextInt();

        rotate(arr,k);
        display(arr);

        scn.close();
    }
}
