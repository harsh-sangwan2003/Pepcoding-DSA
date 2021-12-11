import java.util.Scanner;

public class inverseEasy {

    public static int Inverse(int num) {

        int idx = 1, res = 0, ld = 0;

        while (num != 0) {

            ld = num % 10;
            num /= 10;
            res += idx * (int) Math.pow(10, ld - 1);
            idx++;
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
