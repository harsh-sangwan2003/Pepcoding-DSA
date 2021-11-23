import java.util.Scanner;

public class gcdLCM {

    public static int findGCD(int a, int b) {

        int min = Math.min(a, b), pans = 1;

        for (int i = 2; i <= min; i++) {

            if (a % i == 0 && b % i == 0)
                pans = i;
        }

        return pans;
    }

    public static int fincLCM(int a, int b, int gcd) {

        return (a * b) / gcd;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt();

        int gcd = findGCD(a, b);
        int lcm = fincLCM(a, b, gcd);

        System.out.println(gcd);
        System.out.println(lcm);

        scn.close();
    }
}
