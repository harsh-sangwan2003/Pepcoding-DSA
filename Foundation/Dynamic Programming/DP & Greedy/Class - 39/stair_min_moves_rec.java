import java.util.Scanner;

public class stair_min_moves_rec {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        Integer ans = minMoves(0, n, arr);

        System.out.println(ans);

        scn.close();
    }

    public static Integer minMoves(int src, int dest, int[] arr) {

        if (src == dest)
            return 0;

        int min = Integer.MAX_VALUE;

        for (int jump = 1; jump <= arr[src] && jump + src <= dest; jump++) {

            Integer call = minMoves(src + jump, dest, arr);

            if (call != null)
                min = Math.min(min, call);
        }

        if (min != Integer.MAX_VALUE)
            return min + 1;

        else
            return null;
    }

}