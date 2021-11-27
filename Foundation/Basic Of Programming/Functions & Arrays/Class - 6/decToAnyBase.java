import java.util.Scanner;

public class decToAnyBase {

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

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(decToAny(num, b));
        scn.close();
    }
}