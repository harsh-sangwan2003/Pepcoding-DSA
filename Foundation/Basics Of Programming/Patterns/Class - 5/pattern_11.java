import java.util.Scanner;

public class pattern_11 {

    public static void pattern(int n) {

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

        pattern(n);
        scn.close();
    }
}