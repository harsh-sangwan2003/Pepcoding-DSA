import java.util.Scanner;

public class flood_fill_3 {

    public static void floodFill(int[][] maze, int sr, int sc, String psf) {

        if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1)
            return;

        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(psf);
            return;
        }

        maze[sr][sc] = 1;

        for (int i = 0; i < dir.length; i++) {

            int r = sr + dir[i][0];
            int c = sc + dir[i][1];
            floodFill(maze, r, c, psf + code[i]);
        }
        maze[sr][sc] = 0;
    }

    public static int[][] dir = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
    public static char[] code = { 't', 'l', 'd', 'r' };

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

        floodFill(arr, 0, 0, "");

        scn.close();
    }
}
