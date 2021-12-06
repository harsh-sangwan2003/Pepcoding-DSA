import java.util.Scanner;

public class spiralDisplay {

    public static void printSpiral(int[][] arr){

        int n = arr.length;
        int m = arr[0].length;

        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = m-1;

        int count = 0;
        int ne = n*m;

        while(count<ne){

            // Left
            for(int r=minr; r<=maxr&&count<ne; r++){

                System.out.println(arr[r][minc]);
                count++;
            }
            minc++;

            // Bottom
            for(int c=minc; c<=maxc&&count<ne; c++){

                System.out.println(arr[maxr][c]);
                count++;
            }
            maxr--;

            // Right
            for(int r=maxr; r>=minr&&count<ne; r--){

                System.out.println(arr[r][maxc]);
                count++;
            }
            maxc--;

            // Top
            for(int c=maxc; c>=minc&&count<ne; c--){

                System.out.println(arr[minr][c]);
                count++;
            }
            minr++;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        printSpiral(arr);
        scn.close();
    }
}