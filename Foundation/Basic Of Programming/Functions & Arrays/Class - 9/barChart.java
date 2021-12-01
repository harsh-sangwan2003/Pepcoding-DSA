import java.util.Scanner;

public class barChart {

    public static int maximum(int[] arr){

        int max = -(int)1e9;

        for (int i = 0; i < arr.length; i++) {

            max = Math.max(arr[i], max);
        }

        return max;
    }
    public static void printChart(int[] arr) {

        int max = maximum(arr);

        for(int r=max; r>=1; r--){

            for(int i=0; i<arr.length; i++){

                if(arr[i]>=r){

                    System.out.print("*\t");
                }

                else{

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
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        
        printChart(arr);

        scn.close();
    }
}