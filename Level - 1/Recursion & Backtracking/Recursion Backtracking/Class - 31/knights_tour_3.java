//Time - O(n^2)
//Space - O(n^2)

import java.util.*;

public class knights_tour_3 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] chess = new int[n][n];

        printKnightsTour(chess, r, c, 1);

        scn.close();
    }

    static int[][] dir = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };

    public static void printKnightsTour(int[][] chess, int r, int c, int move) {

        if (move == chess.length * chess.length) {

            chess[r][c] = move;
            displayBoard(chess);
            chess[r][c] = 0;

            return;
        }

        chess[r][c] = move;

        for (int i = 0; i < dir.length; i++) {

            int row = r + dir[i][0];
            int col = c + dir[i][1];

            if (row >= 0 && col >= 0 && row < chess.length && col < chess.length && chess[row][col] == 0)
                printKnightsTour(chess, row, col, move + 1);
        }

        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess) {

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}