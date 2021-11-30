import java.util.Scanner;

public class rotateNumber {

    public static int countDigits(int num) {

        int count = 0;

        while (num != 0) {

            count++;
            num /= 10;
        }

        return count;
    }

    public static int pow(int n) {

        int res = 1;

        for (int i = 1; i <= n; i++)
            res *= 10;

        return res;
    }

    public static int rotate(int num, int k) {

        int len = countDigits(num);

        k = (k % len + len) % len;

        int div = pow(k);
        int mul = pow(len - k);

        int a = num % div;
        int b = num / div;

        int ans = a * mul + b;

        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();

        System.out.println(rotate(num, k));
        scn.close();
    }
}
