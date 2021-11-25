import java.util.Scanner;

public class pattern_16 {

    public static void pattern(int n) {

        int nst = 1;
        int nsp = 2 * n - 3;

        for (int r = 1; r <= n; r++) {

            int num = 1;

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print(num + "\t");
                num++;
            }

            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print("\t");
            }

            if (r == n) {

                nst--;
                num--;
            }

            num--;

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print(num + "\t");
                num--;
            }

            nst++;
            nsp -= 2;

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
