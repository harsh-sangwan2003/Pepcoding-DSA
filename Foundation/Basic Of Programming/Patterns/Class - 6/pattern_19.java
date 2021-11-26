import java.util.Scanner;

public class pattern_19 {

    public static void pattern(int n) {

        for (int r = 1; r <= n; r++) {

            for (int c = 1; c <= n; c++) {

                if (r == 1) {

                    if ((c <= n / 2 + 1) || c == n)
                        System.out.print("*\t");

                    else
                        System.out.print("\t");

                }

                else if (r <= n / 2) {

                    if (c == n / 2 + 1 || c == n)
                        System.out.print("*\t");

                    else
                        System.out.print("\t");
                }

                else if (r == n / 2 + 1) {

                    System.out.print("*\t");
                }

                else if (r < n) {

                    if (c == 1 || c == n / 2 + 1)
                        System.out.print("*\t");

                    else
                        System.out.print("\t");
                }

                else {

                    if (c == 1 || (c >= n / 2 + 1))
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
