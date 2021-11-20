import java.util.Scanner;

public class primeTillN {

    public static boolean isPrime(int num) {

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {

                return false;
            }
        }

        return true;
    }

    public static void printTillN(int lo, int hi) {

        for (int num = lo; num <= hi; num++) {

            if (isPrime(num)) {

                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int lo = scn.nextInt(), hi = scn.nextInt();

        printTillN(lo, hi);
    }
}
