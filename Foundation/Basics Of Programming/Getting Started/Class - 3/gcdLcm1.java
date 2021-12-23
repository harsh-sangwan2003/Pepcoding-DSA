// Time - O(n)
// Spcae - O(1)

import java.util.Scanner;

public class gcdLcm1 {

    public static int GCD(int a, int b) {

        int ans = 1;
        if (a > b) {

            for (int i = 2; i <= a; i++) {

                if (a % i == 0 && b % i == 0) {

                    ans = i;
                }
            }
        }

        else {
            for (int i = 2; i <= b; i++) {

                if (a % i == 0 && b % i == 0) {

                    ans = i;
                }
            }
        }

        return ans;
    }

    public static int LCM(int a, int b, int gcd) {

        return (a * b) / gcd;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int gcd = GCD(a, b);
        int lcm = LCM(a, b, gcd);

        System.out.println(gcd);
        System.out.println(lcm);

        scn.close();
    }
}