import java.util.*;

public class find_factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = factorial(n);
        System.out.println(ans);

        scn.close();
    }

    public static int factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        int n_1 = factorial(n - 1);
        int res = n * n_1;

        return res;
    }

}