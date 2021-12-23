// Time - O(logn)
//Space - O(1)

import java.util.Scanner;

public class inverseHard {

    public static int countDigits(int num) {

        int count = 0;

        while (num != 0) {

            num /= 10;
            count++;
        }

        return count;
    }

    public static int inverse(int n) {

        int ans = 0;
        int nod = countDigits(n);
        int idx = nod;

        while (n != 0) {

            int ld = n % 10;
            n /= 10;

            ans += (int) Math.pow(10, nod - ld) * idx;
            idx--;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(inverse(n));
        scn.close();
    }
}