import java.util.Scanner;

public class functions {

    static Scanner scn = new Scanner(System.in);

    // No return type with no arguments
    public static void printMessage() {

        System.out.println("Hello class!!!");
    }

    public static void sumOfTwoNumbers() {

        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(a + b);
    }

    // No return type with arguments
    public static void printTable(int num) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + "X" + i + "=" + num * i);
        }
    }

    public static void printTableInRange(int a, int b) {

        for (int i = a; i <= b; i++) {

            printTable(i);
            System.out.println("-------------");
        }
    }

    public static void printNumbers(int num) {

        for (int i = 1; i <= num; i++) {

            System.out.println(num);
        }
    }

    // Return type with no arguments
    public static int maxOfTwo() {

        int a = scn.nextInt();
        int b = scn.nextInt();

        return Math.max(a, b);
    }

    // Return type with arguments
    public static boolean isPrime(int num) {

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        printMessage();
        sumOfTwoNumbers();

        int a = scn.nextInt(), b = scn.nextInt();
        printTableInRange(a, b);

        maxOfTwo();

        System.out.println(isPrime(scn.nextInt()));
        scn.close();
    }
}