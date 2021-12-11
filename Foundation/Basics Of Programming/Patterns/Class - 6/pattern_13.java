import java.util.Scanner;

public class pattern_13 {

    public static int fact(int num) {

        int res = 1;

        for (int i = num; i > 1; i--)
            res *= i;

        return res;
    }

    public static void pattern(int num) {

        int nst = 1;

        for (int n = 0; n < num; n++) {

            for (int r = 0; r < nst; r++) {

                int ans = fact(n) / (fact(n - r) * fact(r));
                System.out.print(ans + "\t");
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
