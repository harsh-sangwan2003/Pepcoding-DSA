import java.util.Scanner;

public class pattern3 {

    public static void pattern(int n) {

        int nst = 2 * n - 1, nsp = 0;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print("*\t");
            }

            nst -= 2;
            nsp++;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pattern(n);
        scn.close();
    }
}