import java.util.Scanner;

public class pattern_20 {

    public static void pattern(int n) {

        for (int r = 1; r <= n; r++) {

            for (int c = 1; c <= n; c++) {

                if (c == 1 || c == n || (r == n / 2 + 1 && c == r) || (r > n / 2 + 1 && c == r)
                        || (r > n / 2 + 1 && c + r == n + 1))
                    System.out.print("*\t");

                else
                    System.out.print("\t");
            }

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
