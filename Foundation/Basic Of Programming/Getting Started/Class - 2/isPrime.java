import java.util.Scanner;

public class isPrime {

    public static void isPrime(int n) {

        boolean flag = true;
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {

            System.out.println("prime");
        }

        else {

            System.out.println("not prime");
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 1; i <= t; i++) {

            int n = scn.nextInt();
            isPrime(n);
        }

        scn.close();
    }
}
