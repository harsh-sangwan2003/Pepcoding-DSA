import java.io.BufferedReader;
import java.io.InputStreamReader;

public class count_islands {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }

        // write your code here
        int count = 0;
        boolean[][] visit = new boolean[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == 0 && !visit[i][j]) {

                    dfs(arr, i, j, visit);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void dfs(int[][] arr, int r, int c, boolean[][] visit) {

        if (r < 0 || c < 0 || r >= arr.length || c >= arr[0].length || arr[r][c] == 1 || visit[r][c])
            return;

        visit[r][c] = true;

        dfs(arr, r - 1, c, visit);
        dfs(arr, r, c - 1, visit);
        dfs(arr, r + 1, c, visit);
        dfs(arr, r, c + 1, visit);
    }

}