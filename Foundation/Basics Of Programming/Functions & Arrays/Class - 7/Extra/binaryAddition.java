package Extra;

import java.util.Scanner;

public class binaryAddition {

    public static int add(int a, int b) {

        int res = 0;
        int pow = 1;
        int carry = 0;

        while (a != 0 || b != 0 || carry != 0) {

            int d = carry + (a % 10) + (b % 10);

            carry = d / 2;
            d = d % 2;

            a /= 10;
            b /= 10;
            res += d * pow;
            pow *= 10;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println(add(scn.nextInt(), scn.nextInt()));

        scn.close();
    }
}
