import java.util.Scanner;

public class primeFactorisation {

    public static void primeFactors(int num) {

        for (int i = 2; i * i <= num; i++) {

            while (num % i == 0) {

                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num != 1)
            System.out.println(num);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        primeFactors(num);
        scn.close();
    }
}
