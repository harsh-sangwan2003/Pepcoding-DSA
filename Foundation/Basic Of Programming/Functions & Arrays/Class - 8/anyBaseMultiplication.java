import java.util.Scanner;

public class anyBaseMultiplication {

    public static int add(int base, int a, int b) {

        int carry = 0;
        int pow = 1;
        int res = 0;

        while (a != 0 || b != 0 || carry != 0) {

            int sum = carry + a % 10 + b % 10;
            a /= 10;
            b /= 10;

            carry = sum / base;
            sum = sum % base;

            res += sum * pow;
            pow *= 10;
        }

        return res;
    }

    public static int multiply(int b, int n, int m) {

        int ans = 0, pow = 1;

        while (m != 0) {

            int temp = multiplyWithDigit(b, n, m % 10);
            m /= 10;

            ans = add(b, ans, temp * pow);
            pow *= 10;
        }

        return ans;
    }

    public static int multiplyWithDigit(int b, int n, int digit) {

        int carry = 0, res = 0, pow = 1;

        while (n != 0) {

            int prod = carry + (n % 10 * digit);
            n /= 10;

            carry = prod / b;
            prod = prod % b;

            res += prod * pow;
            pow *= 10;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n = scn.nextInt();
        int m = scn.nextInt();

        System.out.println(multiply(b, n, m));
        scn.close();
    }
}
