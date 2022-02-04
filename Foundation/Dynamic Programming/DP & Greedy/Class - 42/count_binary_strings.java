//Time - O(n)
//Space - O(1)

import java.util.Scanner;

public class count_binary_strings {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = countBinary(n);
        System.out.println(ans);

        scn.close();
    }

    public static int countBinary(int n) {

        int oldZeroCount = 1;
        int oldOneCount = 1;

        for (int i = 2; i <= n; i++) {

            int newZeroCount = oldOneCount;
            int newOneCount = oldZeroCount + oldOneCount;

            oldZeroCount = newZeroCount;
            oldOneCount = newOneCount;
        }

        int res = oldOneCount + oldZeroCount;
        return res;
    }

}