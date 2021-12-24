import java.util.Scanner;

public class pattern_19 {

    public static void pattern(int n) {

        for (int r = 1; r <= n; r++) {

            for (int j = 1; j <= n; j++) {

                if (r == 1) {

                    if (j <= n / 2 + 1 || j == n)
                        System.out.print("*\t");

                    else
                        System.out.print("\t");
                }

                else if (r > 1 && r <= n / 2) {

                    if (j == n / 2 + 1 || j == n)
                        System.out.print("*\t");

                    else
                        System.out.print("\t");
                }

                else if (r == n / 2 + 1) {

                    System.out.print("*\t");
                }

                else if (r > n / 2 + 1 && r < n) {
                    if (j == n / 2 + 1 || j == 1)
                        System.out.print("*\t");

                    else
                        System.out.print("\t");
                }

                else {
                    if (j >= n / 2 + 1 || j == 1)
                        System.out.print("*\t");

                    else
                        System.out.print("\t");
                }
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
