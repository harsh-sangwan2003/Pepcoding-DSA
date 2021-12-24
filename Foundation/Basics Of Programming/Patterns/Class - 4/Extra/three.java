package Extra;

import java.util.Scanner;

public class three {

    public static void pattern(int n) {

        int nsp = 0, nst = 2 * n - 1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            System.out.println();
            nsp++;
            nst -= 2;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pattern(n);
        scn.close();
    }
}