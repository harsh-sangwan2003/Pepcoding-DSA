import java.util.Scanner;

public class pattern_8 {

    public static void pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i + j == n - 1)
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