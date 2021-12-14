import java.util.Scanner;

public class powerLinear {

    public static int power(int x, int n) {

        if (n == 0)
            return 1;

        int x_n_1 = power(x, n - 1);
        int ans = x * x_n_1;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(power(x, n));
        scn.close();
    }
}