import java.util.Scanner;

public class pattern_2 {

    public static void pattern(int n) {

        int nst = n;

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= nst; cst++) {

                System.out.print("*\t");
            }

            nst--;
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