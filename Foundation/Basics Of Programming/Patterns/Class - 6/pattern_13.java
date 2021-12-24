import java.util.Scanner;

public class pattern_13 {

    public static int factorial(int n) {

        int res = 1;

        for (int i = 2; i <= n; i++)
            res *= i;

        return res;
    }

    public static void pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                int num = factorial(i) / (factorial(j) * factorial(i - j));

                System.out.print(num + "\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pattern(n);
        scn.close();
    }
}
