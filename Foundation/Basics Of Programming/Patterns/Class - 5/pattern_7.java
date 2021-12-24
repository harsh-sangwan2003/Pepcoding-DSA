import java.util.Scanner;

public class pattern_7 {

    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (i == j)
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