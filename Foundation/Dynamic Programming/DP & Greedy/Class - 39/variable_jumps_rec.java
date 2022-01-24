import java.util.Scanner;

public class variable_jumps_rec {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int ans = countPaths(0, n, arr);
        System.out.println(ans);

        scn.close();
    }

    public static int countPaths(int src, int dest, int[] arr) {

        if (src == dest)
            return 1;

        int count = 0;

        for (int jump = 1; jump + src <= dest && jump <= arr[src]; jump++) {

            count += countPaths(src + jump, dest, arr);
        }

        return count;
    }

}