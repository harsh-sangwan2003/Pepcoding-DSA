import java.util.Scanner;

public class digitsOfNumber {

    public static int countDigits(int n) {

        int count = 0;

        while (n != 0) {

            n /= 10;
            count++;
        }

        return count;
    }

    public static int calculatePower(int n) {

        int res = 1;

        for (int i = 1; i <= n; i++)
            res *= 10;

        return res;
    }

    public static void digits(int n) {

        int len = countDigits(n);
        int div = calculatePower(len - 1);

        while (div != 0) {

            System.out.println(n / div);
            n = n % div;
            div /= 10;
        }

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        digits(n);
    }
}
