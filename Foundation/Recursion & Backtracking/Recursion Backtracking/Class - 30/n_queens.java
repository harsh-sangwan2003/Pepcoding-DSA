import java.util.Scanner;

public class n_queens {

    public static void printNQueens(int[][] chess, String qsf, int r) {

        if (r == chess.length) {

            System.out.println(qsf + ".");
            return;
        }

        for (int c = 0; c < chess.length; c++) {

            if (isSafe(chess, r, c)) {

                chess[r][c] = 1;
                printNQueens(chess, qsf + r + "-" + c + ", ", r + 1);
                chess[r][c] = 0;
            }
        }
    }

    public static boolean isSafe(int[][] chess, int sr, int sc) {

        // Row
        for (int r = sr - 1; r >= 0; r--) {

            if (chess[r][sc] == 1)
                return false;
        }

        // Diagonal
        for (int r = sr - 1, c = sc - 1; r >= 0 && c >= 0; r--, c--) {

            if (chess[r][c] == 1)
                return false;
        }

        // Anti-diagonal
        for (int r = sr - 1, c = sc + 1; r >= 0 && c < chess.length; r--, c++) {

            if (chess[r][c] == 1)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] chess = new int[n][n];

        printNQueens(chess, "", 0);
        scn.close();
    }
}