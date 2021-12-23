// Time - O(logk)
// Space - O(1)

import java.util.Scanner;

public class rotateNumber {

    public static int countDigits(int num) {

        int count = 0;

        while (num != 0) {

            num /= 10;
            count++;
        }

        return count;
    }

    public static int rotate(int num, int k) {

        int nod = countDigits(num);
        k = k % nod;
        if (k < 0)
            k += nod;

        int div = (int) Math.pow(10, k);
        int mul = (int) Math.pow(10, nod - k);

        int a = num / div;
        int b = num % div;
        int ans = b * mul + a;

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