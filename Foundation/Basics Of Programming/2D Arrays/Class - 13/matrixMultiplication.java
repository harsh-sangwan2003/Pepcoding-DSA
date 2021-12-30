import java.util.Scanner;

public class matrixMultiplication {

    public static void multiplyMatrix(int[][] mat1, int[][] mat2) {

        int n1 = mat1.length;
        int m1 = mat1[0].length;
        // int n2 = mat2.length;
        int m2 = mat2[0].length;

        int[][] ans = new int[n1][m2];

        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < m2; j++) {

                for (int k = 0; k < m1; k++) {

                    ans[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        display(ans);
    }

    public static void display(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();

        int[][] mat1 = new int[n1][m1];
        for (int i = 0; i < mat1.length; i++) {

            for (int j = 0; j < mat1[0].length; j++) {

                mat1[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();

        int[][] mat2 = new int[n2][m2];
        for (int i = 0; i < mat2.length; i++) {

            for (int j = 0; j < mat2[0].length; j++) {

                mat2[i][j] = scn.nextInt();
            }
        }

        if (m1 != n2) {

            System.out.println("Invalid input");
            System.exit(0);
        }

        multiplyMatrix(mat1, mat2);
        scn.close();
    }
}
