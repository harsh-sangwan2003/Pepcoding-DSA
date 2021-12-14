import java.util.Scanner;

public class powerLog {

    public static int power(int x, int n) {

        if (n == 0)
            return 1;

        int xn2 = power(x, n / 2);

        if (n % 2 == 0)
            return xn2 * xn2;

        else
            return xn2 * xn2 * x;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(power(x, n));
        scn.close();
    }
}