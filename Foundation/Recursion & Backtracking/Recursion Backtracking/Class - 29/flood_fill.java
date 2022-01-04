import java.util.Scanner;

public class flood_fill {

    public static void floodFill(int[][] maze, int r, int c, boolean[][] visit, String psf) {

        if (r < 0 || c < 0 || r >= maze.length || c >= maze[0].length || maze[r][c] == 1 || visit[r][c])
            return;

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(psf);
            return;
        }

        visit[r][c] = true;
        floodFill(maze, r - 1, c, visit, psf + "t");
        floodFill(maze, r, c - 1, visit, psf + "l");
        floodFill(maze, r + 1, c, visit, psf + "d");
        floodFill(maze, r, c + 1, visit, psf + "r");
        visit[r][c] = false;
    }

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

        boolean[][] visit = new boolean[n][m];
        floodFill(arr, 0, 0, visit, "");

        scn.close();
    }
}