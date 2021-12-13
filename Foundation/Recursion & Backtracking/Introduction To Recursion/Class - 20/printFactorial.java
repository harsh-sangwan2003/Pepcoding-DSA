import java.util.Scanner;

public class printFactorial {

    public static int factorial(int n) {

        if (n == 1)
            return 1;

        int n_1 = factorial(n - 1);
        int res = n * n_1;
        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = factorial(n);
        System.out.println(ans);
        scn.close();
    }
}