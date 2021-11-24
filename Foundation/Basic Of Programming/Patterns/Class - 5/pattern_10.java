import java.util.Scanner;

public class pattern_10 {

    public static void pattern(int n) {

        int nsp1 = n / 2;
        int nsp2 = -1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp1; csp++) {

                System.out.print("\t");
            }

            System.out.print("*\t");

            for (int csp = 1; csp <= nsp2; csp++) {

                System.out.print("\t");
            }

            if (r != 1 && r != n)
                System.out.print("*\t");

            System.out.println();

            if (r <= n / 2) {

                nsp1--;
                nsp2 += 2;
            }

            else {

                nsp1++;
                nsp2 -= 2;
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
