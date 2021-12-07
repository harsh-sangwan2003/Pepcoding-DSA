import java.util.Scanner;

public class rotateArrayBy90 {

    public static void reverse(int[] arr, int lo, int hi){

        while(lo<=hi){

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }

    public static void rotateArray(int[][] arr) {
        

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[0].length; j++){

                if(j>i){

                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        for(int r=0; r<arr.length; r++){

            reverse(arr[r],0,arr[0].length-1);
        }
    }

    public static void display(int[][] arr){

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[0].length; j++){

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        rotateArray(arr);
        display(arr);
        scn.close();
    }
}