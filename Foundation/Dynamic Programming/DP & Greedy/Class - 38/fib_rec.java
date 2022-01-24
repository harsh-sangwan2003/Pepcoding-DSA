import java.util.Scanner;

public class fib_rec {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = fib(n);

        System.out.println(ans);
        scn.close();
    }

    public static int fib(int n) {

        if (n <= 1)
            return n;

        int n_1 = fib(n - 1);
        int n_2 = fib(n - 2);

        return n_1 + n_2;
    }

}