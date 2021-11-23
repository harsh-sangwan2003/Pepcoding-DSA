import java.util.Scanner;

public class extraPatterns {

    public static void pattern1(int n) {

        int nsp = n - 1, nst = 1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print("*\t");
            }

            nsp -= 1;
            nst += 2;

            System.out.println();
        }
    }

    public static void pattern2(int n) {

        int nsp = 0, nst = 2 * n - 1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print("*\t");
            }

            nsp += 1;
            nst -= 2;

            System.out.println();
        }
    }

    public static void pattern3(int n) {

        int nsp = n - 1, nst = 1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print("*\t");
            }

            nsp -= 1;
            nst += 2;

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // pattern1(n);
        // pattern2(n);

        pattern3(n);
        scn.close();
    }
}
