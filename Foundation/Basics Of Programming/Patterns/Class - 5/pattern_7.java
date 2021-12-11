import java.util.Scanner;

public class pattern_7 {

    public static void pattern(int n) {

        int nsp = 0;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++) {

                System.out.print("\t");
            }

            System.out.println("*\t");
            nsp++;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pattern(n);
    }
}