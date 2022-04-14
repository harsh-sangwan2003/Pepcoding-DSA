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

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == 0) {

                    dfs(arr, i, j);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void dfs(int[][] arr, int r, int c) {

        if (r < 0 || c < 0 || r >= arr.length || c >= arr[0].length || arr[r][c] == 1)
            return;

        arr[r][c] = 1;

        dfs(arr, r - 1, c);
        dfs(arr, r, c - 1);
        dfs(arr, r + 1, c);
        dfs(arr, r, c + 1);
    }

}