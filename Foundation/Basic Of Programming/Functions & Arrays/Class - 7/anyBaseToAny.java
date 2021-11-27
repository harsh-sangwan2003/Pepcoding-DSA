import java.util.Scanner;

public class anyBaseToAny {

    public static int decToAny(int num, int b) {

        int ans = 0;
        int pow = 1;

        while (num != 0) {

            int rem = num % b;
            num /= b;

            ans += rem * pow;
            pow *= 10;
        }

        return ans;
    }

    public static int anyToDec(int num, int b) {

        int ans = 0;
        int pow = 1;

        while (num != 0) {

            int rem = num % 10;
            num /= 10;

            ans += rem * pow;
            pow *= b;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int temp = anyToDec(num, b1);
        int ans = decToAny(temp, b2);

        System.out.println(ans);
        scn.close();
    }
}