import java.util.Scanner;

public class tower_of_hanoi {

    public static void toh(int n, int A, int B, int C) {

        if (n == 0)
            return;

        toh(n - 1, A, C, B);

        System.out.println(n + "[" + A + " -> " + B + "]");

        toh(n - 1, C, B, A);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int t1 = scn.nextInt();
        int t2 = scn.nextInt();
        int t3 = scn.nextInt();

        toh(n, t1, t2, t3);
        scn.close();
    }
}