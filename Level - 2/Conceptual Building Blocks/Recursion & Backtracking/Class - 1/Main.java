public class Main {

    public static boolean inRange(int i, int j, int n, int m) {

        if (i < 0 || j < 0 || i >= n || j >= m)
            return false;

        return true;
    }

    // Without Jumps
    public static int mazePath_01(int sr, int sc, int dr, int dc, int[][] dir, String[] dirName, String asf) {

        if (sr == dr && sc == dc) {

            System.out.println(asf);
            return 1;
        }

        int count = 0;

        for (int d = 0; d < dir.length; d++) {

            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (inRange(r, c, dr + 1, dc + 1)) {

                count += mazePath_01(r, c, dr, dc, dir, dirName, asf + dirName[d]);
            }
        }

        return count;
    }

    // With Jumps
    public static int mazePath_02(int sr, int sc, int dr, int dc, int[][] dir, String[] dirName, String asf) {

        if (sr == dr && sc == dc) {

            System.out.println(asf);
            return 1;
        }

        int count = 0;

        for (int d = 0; d < dir.length; d++) {

            for (int ms = 1; ms <= Math.max(dr, dc); ms++) {

                int r = sr + (dir[d][0] * ms);
                int c = sc + (dir[d][1] * ms);

                if (inRange(r, c, dr + 1, dc + 1))
                    count += mazePath_02(r, c, dr, dc, dir, dirName, asf + dirName[d] + ms);
            }
        }

        return count;
    }

    public static void mazePath() {

        int n = 3;
        int m = 3;

        int[][] dir = { { 0, 1 }, { 1, 0 }, { 1, 1 } };
        String[] dirName = { "H", "V", "D" };

        // int ans = mazePath_01(0, 0, n - 1, m - 1, dir, dirName, "");
        int ans = mazePath_02(0, 0, n - 1, m - 1, dir, dirName, "");
        System.out.println(ans);

    }

    public static int floodFill_01(int sr, int sc, int dr, int dc, boolean[][] vis, int[][] dir, String[] dirName,
            String asf) {

        if (sr == dr && sc == dc) {

            System.out.println(asf);
            return 1;
        }

        vis[sr][sc] = true;
        int count = 0;

        for (int d = 0; d < dir.length; d++) {

            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (inRange(r, c, dr + 1, dc + 1) && !vis[r][c])
                count += floodFill_01(r, c, dr, dc, vis, dir, dirName, asf + dirName[d]);

        }

        vis[sr][sc] = false;

        return count;
    }

    public static int floodFill_02(int sr, int sc, int dr, int dc, boolean[][] vis, int[][] dir, String[] dirName,
            String asf) {

        if (sr == dr && sc == dc) {

            System.out.println(asf);
            return 1;
        }

        vis[sr][sc] = true;
        int count = 0;

        for (int d = 0; d < dir.length; d++) {

            for (int ms = 1; ms <= Math.max(dr, dc); ms++) {

                int r = sr + dir[d][0] * ms;
                int c = sc + dir[d][1] * ms;

                if (inRange(r, c, dr + 1, dc + 1) && !vis[r][c])
                    count += floodFill_02(r, c, dr + 1, dc + 1, vis, dir, dirName, asf + dirName[d] + ms);
            }

        }

        vis[sr][sc] = false;
        return count;
    }

    // Flood Fill
    public static void floodfill() {

        int n = 3;
        int m = 4;

        // Consumes less space than int[][] -> 2*n*m
        boolean[][] vis = new boolean[n][m];

        int[][] dir = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 } };
        String[] dirName = { "A", "B", "C", "D", "E", "F", "G", "H" };

        // int ans = floodFill_01(0, 0, n - 1, m - 1, vis, dir, dirName, "");
        int ans = floodFill_02(0, 0, n - 1, m - 1, vis, dir, dirName, "");
        System.out.println(ans);
    }

    public static void main(String[] args) {

        // mazePath();
        floodfill();
    }
}