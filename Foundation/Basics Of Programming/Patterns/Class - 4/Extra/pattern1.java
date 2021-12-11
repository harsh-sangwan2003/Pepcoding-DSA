import java.util.Scanner;

public class pattern1 {

    public static void pattern(int n) {

        int nst = 4, nsp = 4;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print("*\t");
            }

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