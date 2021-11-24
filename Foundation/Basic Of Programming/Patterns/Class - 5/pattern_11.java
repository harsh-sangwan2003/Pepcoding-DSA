import java.util.Scanner;

public class pattern_11 {

    public static void pattern(int n) {

        int nst = 1;

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print("*\t");
            }

            System.out.println();
            nst++;
        }
    }

    public static void pattern2(int n) {

        int nst = 1;

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print(nst + "\t");
            }

            System.out.println();
            nst++;
        }
    }

    public static void pattern3(int n) {

        int nst = 1;
        int num = 1;

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print(num + "\t");
                num++;
            }

            System.out.println();
            nst++;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // pattern(n);
        // pattern2(n);
        pattern3(n);
        scn.close();
    }
}
