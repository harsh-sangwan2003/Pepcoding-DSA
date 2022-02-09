// Time - O(n)
// Space - O(1)

import java.util.Scanner;

public class paint_fence {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int res = paintFence(n, k);
        System.out.println(res);

        scn.close();
    }

    public static int paintFence(int n, int k) {

        int same = k;
        int diff = k * (k - 1);
        int total = same + diff;

        for (int i = 3; i <= n; i++) {

            same = diff;
            diff = total * (k - 1);

            total = same + diff;
        }

        return total;
    }
}