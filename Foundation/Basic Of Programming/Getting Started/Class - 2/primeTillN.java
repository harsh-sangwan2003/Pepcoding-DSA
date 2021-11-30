import java.util.Scanner;

public class primeTillN {

    public static boolean isPrime(int num) {

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void printPrime(int a, int b) {

        for (int num = a; num <= b; num++) {

            if (isPrime(num)) {

                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int low = scn.nextInt();
        int high = scn.nextInt();

        printPrime(low, high);
        scn.close();
    }
}
