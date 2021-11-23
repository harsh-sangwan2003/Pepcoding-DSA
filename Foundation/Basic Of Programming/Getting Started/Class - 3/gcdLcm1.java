import java.util.Scanner;

public class gcdLcm1 {

    public static int findGcd(int a, int b) {

        int pans = 1;

        if (a > b) {

            for (int i = 2; i <= b; i++) {

                if (a % i == 0 && b % i == 0)
                    pans = i;
            }
        }

        else if (a < b) {

            for (int i = 2; i <= a; i++) {

                if (a % i == 0 && b % i == 0)
                    pans = i;
            }
        }

        else {

            pans = a;
        }

        return pans;
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
