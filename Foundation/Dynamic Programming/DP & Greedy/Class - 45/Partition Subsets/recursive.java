//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class recursive {

    public static long partitionKSubset(int n, int k) {
        // write your code here
        if (n < k || n == 0 || k == 0)
            return 0L;

        else if (n == k)
            return 1L;

        long diff = partitionKSubset(n - 1, k - 1);
        long pair = partitionKSubset(n - 1, k);

        return diff + k * pair;
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