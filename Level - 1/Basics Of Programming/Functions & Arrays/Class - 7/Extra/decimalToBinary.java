package Extra;

import java.util.Scanner;

public class decimalToBinary {

    public static int decToBin(int num) {

        int res = 0;
        int pow = 1;

        while (num != 0) {

            int rem = num % 2;
            num /= 2;

            res += rem * pow;
            pow *= 10;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println(decToBin(scn.nextInt()));

        scn.close();
    }
}
