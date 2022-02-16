//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class recursive {

    public static long partitionKSubset(int n, int k) {
        // write your code here

        if (n < k)
            return 0;

        else if (k == 1 || n == k)
            return 1;

        long x = partitionKSubset(n - 1, k - 1);
        long y = partitionKSubset(n - 1, k);

        return (long) (x + y * k);
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        long res = partitionKSubset(n, k);
        System.out.println(res);

        scn.close();
    }
}