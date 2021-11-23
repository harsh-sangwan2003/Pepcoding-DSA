import java.util.*;

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

        k = (k % nod + nod) % nod;

        int div = 1, mul = 1;

        for (int i = 1; i <= nod; i++) {

            if (i <= k)
                div *= 10;

            else
                mul *= 10;
        }

        int a = num % div;
        int b = num / div;

        int res = (a * mul) + b;

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();

        System.out.println(rotate(num, k));

        scn.close();
    }
}