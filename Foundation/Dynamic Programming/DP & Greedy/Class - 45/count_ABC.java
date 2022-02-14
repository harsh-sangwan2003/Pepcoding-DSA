//Time - O(n)
//Space - O(1)

import java.util.Scanner;

public class count_ABC {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int res = countSeq(str);
        System.out.println(res);

        scn.close();
    }

    public static int countSeq(String str) {

        int a = 0;
        int ab = 0;
        int abc = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a')
                a = 2 * a + 1;

            else if (ch == 'b')
                ab = 2 * ab + a;

            else
                abc = 2 * abc + ab;
        }

        return abc;
    }
}