//Time - O(3^n)
//Space - O(n)

import java.util.Scanner;

public class climb_stairs_rec {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int res = countPaths(n);
        System.out.println(res);

        scn.close();
    }

    public static int countPaths(int n) {

        if (n == 0)
            return 1;

        int count = 0;

        if (n - 1 >= 0)
            count += countPaths(n - 1);

        if (n - 2 >= 0)
            count += countPaths(n - 2);

        if (n - 3 >= 0)
            count += countPaths(n - 3);

        return count;
    }

}