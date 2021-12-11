import java.util.Scanner;

public class reverseNumber {

    public static int countDigits(int n) {

        int count = 0;

        while (n != 0) {

            n /= 10;
            count++;
        }

        return count;
    }

    public static int reverse(int n) {

        int ans = 0, len = countDigits(n), pow = (int) Math.pow(10, len - 1);

        while (n != 0) {

            int digit = n % 10;
            ans += digit * pow;
            n /= 10;
            pow /= 10;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(reverse(n));

        scn.close();
    }
}
