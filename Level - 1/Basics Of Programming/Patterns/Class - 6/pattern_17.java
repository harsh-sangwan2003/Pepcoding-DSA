import java.util.Scanner;

public class pattern_17 {

    public static void pattern(int n) {

        int nsp = n / 2, nst = 1;

        for (int r = 1; r <= n; r++) {

            if (r == n / 2 + 1) {

                for (int j = 1; j <= n; j++)
                    System.out.print("*\t");
            }

            else {

                for (int csp = 1; csp <= nsp; csp++)
                    System.out.print("\t");

                for (int cst = 1; cst <= nst; cst++)
                    System.out.print("*\t");
            }

            System.out.println();

            if (r <= n / 2)
                nst++;

            else
                nst--;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pattern(n);
        scn.close();
    }
}
