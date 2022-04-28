import java.util.Scanner;

public class isPrime {

    public static boolean prime(int num) {

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t-- > 0) {

            int num = scn.nextInt();

            if (prime(num))
                System.out.println("prime");

            else
                System.out.println("not prime");
        }
        scn.close();
    }
}