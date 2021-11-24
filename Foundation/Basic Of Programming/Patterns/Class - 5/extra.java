import java.util.Scanner;

public class extra {

    public static void pattern(int n) {

        int nsp = n / 2;
        int nst = 1;
        int num = 1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print(num + "\t");
            }

            System.out.println();
            if (r <= n / 2) {

                nsp--;
                nst += 2;
                num++;
            }

            else {

                nsp++;
                nst -= 2;
                num--;
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
