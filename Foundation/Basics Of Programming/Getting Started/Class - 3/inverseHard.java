import java.util.Scanner;

public class inverseHard {

    public static int noOfDigits(int n) {

        int count = 0;

        while (n != 0) {

            n /= 10;
            count++;
        }

        return count;
    }

    public static int Inverse(int num) {

        int idx = noOfDigits(num), res = 0, ld = 0, digits = idx;

        while (num != 0) {

            ld = num % 10;
            num /= 10;
            res += idx * (int) Math.pow(10, digits - ld);
            idx--;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        System.out.println(Inverse(num));

        scn.close();
    }
}
