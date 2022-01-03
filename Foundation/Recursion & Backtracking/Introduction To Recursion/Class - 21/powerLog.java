import java.util.Scanner;

public class powerLog {

    public static int power(int x, int n) {

        if (n == 0)
            return 1;

        int xn_2 = power(x, n / 2);
        int res = 1;

        if (n % 2 == 0)
            res = xn_2 * xn_2;

        else
            res = x * xn_2 * xn_2;

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        int ans = power(x, n);
        System.out.println(ans);
        scn.close();
    }
}