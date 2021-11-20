import java.util.Scanner;

public class functions {

    public static Scanner scn = new Scanner(System.in);

    // No return type & no arguments
    public static void printMessage() {

        System.out.println("Hello class!");
    }

    public static void printPrime() {

        for (int n = 2; n <= 10; n++) {

            boolean isPrime = true;

            for (int i = 2; i * i <= n; i++) {

                if (n % i == 0) {

                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {

                System.out.println(n);
            }
        }
    }

    public static void naturalNoSum() {

        int sum = 0;

        for (int i = 1; i <= 50; i++) {

            sum += i;
        }

        System.out.println(sum);
    }

    // No return type with arguments
    public static void printTable(int num) {

        for (int i = 1; i < 10; i++) {

            System.out.println(num + "X" + i + "=" + (num * i));
        }
    }

    public static void printTableInRange(int a, int b) {

        for (int i = a; i <= b; i++) {

            printTable(i);
            System.out.println("-----");
        }
    }

    public static void printName(String firstName, String lastName) {

        System.out.println(firstName + lastName);
    }

    public static void square(int n) {

        System.out.println(n * n);
    }

    // Return type with no arguments
    public static int sumOfTwoNumber() {

        int a = scn.nextInt();
        int b = scn.nextInt();

        return (a + b);
    }

    public static int maxOfTwo() {

        int a = scn.nextInt();
        int b = scn.nextInt();

        return (Math.max(a, b));
    }

    public static int reverse() {

        int num = scn.nextInt();
        int res = 0;

        while (num != 0) {

            int ld = num % 10;
            num /= 10;
            res = res * 10 + ld;
        }

        return res;
    }

    public static void main(String[] args) {

        int ans = sumOfTwoNumber();
        System.out.println(ans);

        System.out.println(reverse());
    }
}