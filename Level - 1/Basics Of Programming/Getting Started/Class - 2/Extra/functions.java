package Extra;

import java.util.Scanner;

public class functions {

    public static Scanner scn = new Scanner(System.in);

    // No return type and no arguments
    public static void printMessage() {

        System.out.println("Hello Class!!");
    }

    // No return type with arguments
    public static void printTable(int num) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " X " + i + " = " + num * i);
        }
    }

    public static void printTableInRange(int a, int b) {

        for (int i = a; i <= b; i++) {

            printTable(i);
            System.out.println("===============");
        }
    }

    // Return type with no arguments
    public static int sumOfTwoNumbers() {

        int a = scn.nextInt(), b = scn.nextInt();

        return a + b;
    }

    public static void main(String[] args) {

        int a = scn.nextInt(), b = scn.nextInt();

        printMessage();
        printTableInRange(a, b);

        int ans = sumOfTwoNumbers();
        System.out.println(ans);
        scn.close();
    }
}