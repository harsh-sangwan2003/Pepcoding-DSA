import java.util.Scanner;

public class decimalAddition {

    public static int add(int a, int b) {

        int carry = 0;
        int pow = 1;
        int res = 0;

        while (a != 0 || b != 0 || carry != 0) {

            int sum = carry + a % 10 + b % 10;
            a /= 10;
            b /= 10;

            carry = sum / 10;
            sum = sum % 10;

            res += sum * pow;
            pow *= 10;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(add(a, b));

        scn.close();
    }
}
