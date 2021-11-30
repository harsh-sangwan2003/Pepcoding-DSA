package Extra;

import java.util.Scanner;

public class binaryToDecimal {

    public static int binToDec(int num) {

        int res = 0;
        int pow = 1;

        while (num != 0) {

            int rem = num % 10;
            num /= 10;

            res += rem * pow;
            pow *= 2;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.err.println(binToDec(scn.nextInt()));

        scn.close();
    }
}
