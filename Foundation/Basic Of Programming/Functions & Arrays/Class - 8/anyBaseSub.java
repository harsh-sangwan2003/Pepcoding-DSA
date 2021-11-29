import java.util.Scanner;

public class anyBaseSub {

    public static int sub(int b, int n, int m) {

        int res = 0, borrow = 0, pow = 1;

        while (m != 0) {

            int sub = borrow + m % 10 - n % 10;
            n /= 10;
            m /= 10;

            if (sub < 0) {

                sub += b;
                borrow = -1;
            }

            else {

                borrow = 0;
            }

            res += sub * pow;
            pow *= 10;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int b = scn.nextInt();
        int n = scn.nextInt();
        int m = scn.nextInt();

        System.out.println(sub(b, n, m));

        scn.close();
    }
}