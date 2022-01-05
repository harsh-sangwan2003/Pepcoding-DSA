import java.util.Scanner;

public class knight_tour {

    public static void printKnighPath(int[][] chess, int r, int c, int move) {

        if (r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] != 0)
            return;

        if (move == chess.length * chess.length) {

            chess[r][c] = move;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }

        chess[r][c] = move;
        printKnighPath(chess, r - 2, c + 1, move + 1);
        printKnighPath(chess, r - 1, c + 2, move + 1);
        printKnighPath(chess, r + 1, c + 2, move + 1);
        printKnighPath(chess, r + 2, c + 1, move + 1);
        printKnighPath(chess, r + 2, c - 1, move + 1);
        printKnighPath(chess, r + 1, c - 2, move + 1);
        printKnighPath(chess, r - 1, c - 2, move + 1);
        printKnighPath(chess, r - 2, c - 1, move + 1);
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

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] chess = new int[n][n];

        printKnighPath(chess, r, c, 1);
        scn.close();
    }
}