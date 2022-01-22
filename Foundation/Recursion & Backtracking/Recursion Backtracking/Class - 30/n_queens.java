import java.util.*;

public class n_queens {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[][] chess = new int[n][n];

        printNQueens(chess, "", 0);
        scn.close();
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {

        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }

        for (int c = 0; c < chess.length; c++) {

            if (safe(chess, row, c)) {

                chess[row][c] = 1;
                printNQueens(chess, qsf + row + "-" + c + ", ", row + 1);
                chess[row][c] = 0;
            }
        }
    }

    public static boolean safe(int[][] chess, int row, int col) {

        for (int r = row - 1; r >= 0; r--) {

            if (chess[r][col] == 1)
                return false;
        }

        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {

            if (chess[r][c] == 1)
                return false;
        }

        for (int r = row - 1, c = col + 1; r >= 0 && c < chess.length; r--, c++) {

            if (chess[r][c] == 1)
                return false;
        }

        return true;
    }
}