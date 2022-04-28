//Time - O(2^n)
//Spcae - O(n)

import java.util.Scanner;

public class fib_rec {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = fibonacci(n);
        System.out.println(res);

        scn.close();
    }

    public static int fibonacci(int n) {

        if (n <= 1)
            return n;

        int n_1 = fibonacci(n - 1);
        int n_2 = fibonacci(n - 2);

        return n_1 + n_2;
    }

}