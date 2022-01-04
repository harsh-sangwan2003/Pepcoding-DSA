import java.util.Scanner;

public class flood_fill_2 {

    public static void floodFill(int[][] maze, int r, int c, String psf) {

        if (r < 0 || c < 0 || r >= maze.length || c >= maze[0].length || maze[r][c] == 1)
            return;

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(psf);
            return;
        }

        maze[r][c] = 1;
        floodFill(maze, r - 1, c, psf + "t");
        floodFill(maze, r, c - 1, psf + "l");
        floodFill(maze, r + 1, c, psf + "d");
        floodFill(maze, r, c + 1, psf + "r");
        maze[r][c] = 0;
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

        floodFill(arr, 0, 0, "");

        scn.close();
    }
}
