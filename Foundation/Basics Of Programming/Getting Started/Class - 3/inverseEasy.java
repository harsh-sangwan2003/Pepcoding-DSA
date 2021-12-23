// Time - O(logn)
//Space - O(1)

import java.util.Scanner;

public class inverseEasy {

    public static int inverse(int n) {

        int idx = 1;
        int ans = 0;

        while (n != 0) {

            int ld = n % 10;
            n /= 10;

            ans += (int) Math.pow(10, ld - 1) * idx;
            idx++;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(inverse(n));
        scn.close();
    }
}