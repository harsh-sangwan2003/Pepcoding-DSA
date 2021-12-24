package Extra;

import java.util.Scanner;

public class two {

    public static void pattern(int n) {

        for (int i = 0; i < n; i++) {

            int num = 1;
            for (int j = 0; j <= i; j++) {

                System.out.print(num + "\t");
                num = ((i - j) * num) / (j + 1);
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
