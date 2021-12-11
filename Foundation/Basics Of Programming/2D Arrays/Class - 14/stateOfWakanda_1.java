import java.util.Scanner; 

public class stateOfWakanda_1{

    public static void printState(int[][] arr){


        for(int c=0; c<arr[0].length; c++){

            if(c%2==0){

                for(int r=0; r<arr.length; r++){

                    System.out.println(arr[r][c]);
                }
            }

            else{

                for(int r=arr.length-1; r>=0; r--){

                    System.out.println(arr[r][c]);
                }
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                arr[i][j] = scn.nextInt();
            }
        }

        printState(arr);
        scn.close();
    }
}