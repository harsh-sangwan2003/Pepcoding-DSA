import java.util.Scanner;

public class primeFactorization {

    public static void primeFactors(int num) {

        for (int n = 2; n * n <= num; n++) {

            while (num % n == 0) {

                System.out.print(n + " ");
                num /= n;
            }
        }

        if (num != 1) {

            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        primeFactors(num);

        scn.close();
    }
}
