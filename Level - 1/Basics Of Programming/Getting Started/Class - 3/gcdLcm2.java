// Time - O(log(mina,b))
// Spcae - O(1)

import java.util.Scanner;

public class gcdLcm2 {

    public static int findGcd(int a, int b) {

        while (a % b != 0) {

            int rem = a % b;
            a = b;
            b = rem;
        }

        return b;
    }

    public static int findLcm(int a, int b, int gcd) {

        return a * b / gcd;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt();

        int gcd = findGcd(a, b);
        int lcm = findLcm(a, b, gcd);

        System.out.println(gcd);
        System.out.println(lcm);

        scn.close();
    }
}
