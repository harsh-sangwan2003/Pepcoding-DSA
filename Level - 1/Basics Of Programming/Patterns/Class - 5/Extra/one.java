import java.util.Scanner;

public class one {

    public static void pattern(int n) {

        int nsp1 = 0, nsp2 = n / 2 + 1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp1; csp++)
                System.out.print("\t");

            System.out.print("*\t");

            for (int csp = 1; csp <= nsp2; csp++)
                System.out.print("\t");

            if (r != n / 2 + 1)
                System.out.print("*\t");

            System.out.println();

            if (r <= n / 2) {
                nsp1 += 1;
                nsp2 -= 2;
            }

            else {

                nsp1 -= 1;
                nsp2 += 2;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pattern(n);
        scn.close();
    }
}