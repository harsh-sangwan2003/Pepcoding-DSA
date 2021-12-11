import java.util.Scanner;

public class firstLastIndex {
    
    public static void findIndex(int[] arr, int target){

        int lo = 0;
        int hi = arr.length-1;

        int fi = -1, li = -1;

        while(lo<=hi){

            int mid = lo + (hi-lo)/2;

            if(arr[mid]==target){

                fi = mid;
                hi = mid-1;
            }

            else if(arr[mid]>target){

                hi = mid-1;
            }

            else{

                lo = mid+1;
            }
        }

        lo = 0;
        hi = arr.length-1;

        while(lo<=hi){

            int mid = lo + (hi-lo)/2;

            if(arr[mid]==target){

                li = mid;
                lo = mid+1;
            }

            else if(arr[mid]>target){

                hi = mid-1;
            }

            else{

                lo = mid+1;
            }
        }

        System.out.println(fi);
        System.out.println(li);
    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        arr[i] = scn.nextInt();

        int target = scn.nextInt();
        findIndex(arr,target);
        scn.close();
    }
}
