import java.util.Scanner;

public class printStairPaths2 {

    public static void printPaths(int n, String ans) {

        if (n == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= 3; i++) {

            if (n - i >= 0)
                printPaths(n - i, ans + i);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printPaths(n, "");
        scn.close();
    }
}
