import java.util.Scanner;

public class pattern_14 {

    public static void pattern(int n) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pattern(n);
        scn.close();
    }
}