//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class recursive {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = pairFriends(n);
        System.out.println(res);

        scn.close();
    }

    public static int pairFriends(int n) {

        if (n <= 2)
            return n;

        return pairFriends(n - 1) + (n - 1) * pairFriends(n - 2);
    }

}