import java.util.Scanner;

public class reverseArray {
    
    public static void reverse(int[] arr){

        int lo = 0;
        int hi = arr.length-1;

        while(lo<=hi){

            int temp = arr[hi];
            arr[hi] = arr[lo];
            arr[lo] = temp;
            lo++;
            hi--;
        }
    }

    public static void displayArray(int[] arr){

        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){

            arr[i] = scn.nextInt();
        }

        reverse(arr);
        displayArray(arr);
        scn.close();
    }
}
