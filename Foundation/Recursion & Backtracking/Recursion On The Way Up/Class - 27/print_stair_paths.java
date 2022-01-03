import java.util.Scanner;

public class print_stair_paths {

    public static void printPaths2(int n, String ans) {

        if (n == 0) {

            System.out.println(ans);
            return;
        }

        if (n < 0)
            return;

        printPaths(n - 1, ans + "1");

        printPaths(n - 2, ans + "2");

        printPaths(n - 3, ans + "3");
    }

    public static void printPaths(int n, String ans) {

        if (n == 0) {

            System.out.println(ans);
            return;
        }

        if (n - 1 >= 0)
            printPaths(n - 1, ans + "1");

        if (n - 2 >= 0)
            printPaths(n - 2, ans + "2");

        if (n - 3 >= 0)
            printPaths(n - 3, ans + "3");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        printPaths(n, "");

        scn.close();
    }
}