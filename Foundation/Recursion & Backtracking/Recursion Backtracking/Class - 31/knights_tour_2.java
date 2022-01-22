import java.util.*;

public class knights_tour_2 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] chess = new int[n][n];

        printKnightsTour(chess, r, c, 1);

        scn.close();
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int move) {

        if (move == chess.length * chess.length) {

            chess[r][c] = move;
            displayBoard(chess);
            chess[r][c] = 0;

            return;
        }

        chess[r][c] = move;

        if (r - 2 >= 0 && c + 1 < chess.length && chess[r - 2][c + 1] == 0)
            printKnightsTour(chess, r - 2, c + 1, move + 1);

        if (r - 1 >= 0 && c + 2 < chess.length && chess[r - 1][c + 2] == 0)
            printKnightsTour(chess, r - 1, c + 2, move + 1);

        if (r + 1 < chess.length && c + 2 < chess.length && chess[r + 1][c + 2] == 0)
            printKnightsTour(chess, r + 1, c + 2, move + 1);

        if (r + 2 < chess.length && c + 1 < chess.length && chess[r + 2][c + 1] == 0)
            printKnightsTour(chess, r + 2, c + 1, move + 1);

        if (r + 2 < chess.length && c - 1 >= 0 && chess[r + 2][c - 1] == 0)
            printKnightsTour(chess, r + 2, c - 1, move + 1);

        if (r + 1 < chess.length && c - 2 >= 0 && chess[r + 1][c - 2] == 0)
            printKnightsTour(chess, r + 1, c - 2, move + 1);

        if (r - 1 >= 0 && c - 2 >= 0 && chess[r - 1][c - 2] == 0)
            printKnightsTour(chess, r - 1, c - 2, move + 1);

        if (r - 2 >= 0 && c - 1 >= 0 && chess[r - 2][c - 1] == 0)
            printKnightsTour(chess, r - 2, c - 1, move + 1);

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