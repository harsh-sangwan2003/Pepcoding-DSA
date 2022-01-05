import java.util.Scanner;

public class knight_tour_2 {

    public static int[][] dir = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 },
            { -2, -1 } };

    public static void printKnighPath(int[][] chess, int sr, int sc, int move) {

        if (chess[sr][sc] != 0)
            return;

        if (move == chess.length * chess.length) {

            chess[sr][sc] = move;
            displayBoard(chess);
            chess[sr][sc] = 0;
            return;
        }

        chess[sr][sc] = move;
        for (int i = 0; i < dir.length; i++) {

            int r = sr + dir[i][0];
            int c = sc + dir[i][1];

            if (r >= 0 && c >= 0 && r < chess.length && c < chess.length)
                printKnighPath(chess, r, c, move + 1);
        }
        chess[sr][sc] = 0;

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