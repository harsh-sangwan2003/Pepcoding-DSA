import java.util.Scanner;

public class print_zig_zag {

    public static void print(int n) {

        if (n == 0)
            return;

        System.out.print(n + " ");
        print(n - 1);

        System.out.print(n + " ");
        print(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        print(n);
        scn.close();
    }
}