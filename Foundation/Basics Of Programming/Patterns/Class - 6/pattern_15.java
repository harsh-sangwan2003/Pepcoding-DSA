import java.util.Scanner;

public class pattern_15 {

    public static void pattern(int n) {

        int nst = 1, nsp = n / 2;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print("\t");
            }

            int num = (r > n / 2 + 1) ? n - r + 1 : r;

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print(num + "\t");

                if (cst <= nst / 2)
                    num++;

                else
                    num--;
            }

            System.out.println();

            if (r <= n / 2) {

                nst += 2;
                nsp--;
            }

            else {

                nst -= 2;
                nsp++;
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