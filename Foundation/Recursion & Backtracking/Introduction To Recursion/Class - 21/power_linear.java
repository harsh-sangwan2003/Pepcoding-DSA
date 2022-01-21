import java.util.Scanner;

public class power_linear {

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

        int x_n_1 = power(x, n - 1);
        int res = x * x_n_1;

        return res;
    }

}