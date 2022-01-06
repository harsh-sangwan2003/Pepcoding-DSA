import java.util.Scanner;

public class knight_tour_2 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] chess = new int[n][n];
        int r = scn.nextInt();
        int c = scn.nextInt();

        printKnightsTour(chess, r, c, 1);
        scn.close();
    }

    public static int[][] dir = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 },
            { -2, -1 } };

    public static void printKnightsTour(int[][] chess, int r, int c, int move) {

        if (move == chess.length * chess.length) {

            chess[r][c] = move;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }

        chess[r][c] = move;

        for (int i = 0; i < dir.length; i++) {

            int x = r + dir[i][0];
            int y = c + dir[i][1];

            if (x >= 0 && y >= 0 && x < chess.length && y < chess.length && chess[x][y] == 0)
                printKnightsTour(chess, x, y, move + 1);
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