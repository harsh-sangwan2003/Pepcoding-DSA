// package Extra;

import java.util.Scanner;

public class anyBaseSub {

    public static int sub(int b, int n1, int n2) {

        int res = 0;
        int pow = 1;
        int ld = -1;
        int borrow = 0;

        while (n2 != 0) {

            int d1 = n1 % 10;
            int d2 = n2 % 10;

            if (d2 + borrow >= d1) {

                ld = d2 - d1 + borrow;
                borrow = 0;
            }

            else {

                ld = d2 - d1 + borrow + b;
                borrow = -1;
            }

            n1 /= 10;
            n2 /= 10;
            res += ld * pow;
            pow *= 10;
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        System.out.println(sub(b, n1, n2));

        scn.close();
    }
}
