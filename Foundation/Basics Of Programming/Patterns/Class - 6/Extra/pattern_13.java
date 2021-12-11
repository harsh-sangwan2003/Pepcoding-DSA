package Extra;

import java.util.Scanner;

public class pattern_13 {

    public static void pattern(int num) {

        int nst = 1;

        for (int n = 0; n < num; n++) {

            int val = 1;

            for (int r = 0; r < nst; r++) {

                if (r > 0) {
                    val = ((n - r + 1) * val) / r;
                }

                System.out.print(val + "\t");
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
