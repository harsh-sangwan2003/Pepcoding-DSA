import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean isPrime = true;

        for (int num = 2; num < n; num++) {

            if (n % num == 0) {

                isPrime = false;
                break;
            }
        }

        if (isPrime) {

            System.out.println(n + " is a prime no.");
        }

        else {

            System.out.println(n + "  is not a prime no.");
        }

        scn.close();
    }
}
