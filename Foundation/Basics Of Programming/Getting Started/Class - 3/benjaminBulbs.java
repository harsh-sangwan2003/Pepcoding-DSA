import java.util.Scanner;

public class benjaminBulbs {

    public static void benjaminBulb(int n) {

        for (int i = 1; i * i <= n; i++) {

            System.out.println(i * i);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        benjaminBulb(n);

        scn.close();
    }
}
