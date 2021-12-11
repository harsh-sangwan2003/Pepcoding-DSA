package Extra;

import java.util.Scanner;

public class theory{

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        // 1D array
        int[] arr = new int[n];

        // 2D array
        int[][] ar = new int[n][m];

        // Travel each cell
        for(int i=0; i<ar.length; i++){

            for(int j=0; j<ar[0].length; j++)
            {

                System.out.println(ar[i][j]);
            }
        }

        scn.close();
    }
}