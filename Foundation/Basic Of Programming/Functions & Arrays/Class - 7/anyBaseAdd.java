import java.util.Scanner;

public class anyBaseAdd {

    public static int add(int base, int a, int b) {

        int res = 0;
        int pow = 1;
        int carry = 0;

        while (a != 0 || b != 0 || carry != 0) {

            int d = carry + (a % 10) + (b % 10);

            carry = d / base;
            d = d % base;

            a /= 10;
            b /= 10;
            res += d * pow;
            pow *= 10;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println(add(scn.nextInt(), scn.nextInt(), scn.nextInt()));

        scn.close();
    }
}
