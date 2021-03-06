import java.util.Scanner;

public class pattern_15 {

    public static void pattern(int n) {

        int nsp = n / 2, nst = 1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            int num = r <= n / 2 + 1 ? r : n - r + 1;

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(num + "\t");

                if (cst <= nst / 2)
                    num++;

                else
                    num--;
            }

            System.out.println();
            if (r <= n / 2) {

                nsp--;
                nst += 2;
            }

            else {

                nsp++;
                nst -= 2;
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