import java.util.*;

public class power_log {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int pow = scn.nextInt();

        int ans = power(num, pow);

        System.out.println(ans);

        scn.close();
    }

    public static int power(int x, int n) {

        if (n == 0)
            return 1;

        int x_n_2 = power(x, n / 2);
        int ans = 1;

        if (n % 2 == 0)
            ans = x_n_2 * x_n_2;

        else
            ans = x * x_n_2 * x_n_2;

        return ans;
    }

}