//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class optimised {

    public static int numDecodings(String s) {

        int n = s.length();

        return numDecodings(s, n);
    }

    public static int numDecodings(String s, int N) {

        int a = 0, b = 1;

        for (int n = 1; n <= N; n++) {

            int count = 0;

            if (s.charAt(n - 1) != '0')
                count += b;

            if (n > 1) {
                int val1 = Integer.parseInt(s.charAt(n - 2) + "");
                int val2 = Integer.parseInt(s.charAt(n - 1) + "");
                int val = val1 * 10 + val2;

                if (val >= 10 && val <= 26)
                    count += a;
            }

            a = b;
            b = count;
        }

        return b;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        int res = numDecodings(str);

        System.out.println(res);

        scn.close();
    }
}