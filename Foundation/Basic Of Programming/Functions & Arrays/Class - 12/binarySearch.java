import java.util.Scanner;

public class binarySearch{

    public static int search(int[] arr, int target){

        int lo = 0;
        int hi = arr.length-1;

        while(lo<=hi){

            int mid = lo + (hi-lo)/2;
        
            if(arr[mid]==target)
            return mid;

            else if(arr[mid]>target)
            hi = mid-1;

            else 
            lo = mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){

            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        System.out.println(search(arr,target));
        scn.close();
    }
}