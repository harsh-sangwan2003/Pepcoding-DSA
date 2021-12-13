import java.util.Scanner;

public class printPermutations {

    public static int factorial(int num) {

        int res = 1;

        for (int i = num; i > 1; i--)
            res *= i;

        return res;
    }

    public static void print(String str) {

        int et = factorial(str.length());

        for (int i = 0; i < et; i++) {

            int temp = i;
            String s = str;
            StringBuilder ans = new StringBuilder();
            for (int div = str.length(); div >= 1; div--) {

                int rem = temp % div;
                temp = temp / div;

                String left = s.substring(0, rem);
                ans.append(s.charAt(rem));
                String right = s.substring(rem + 1);
                s = left + right;
            }

            System.out.println(ans);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        print(str);
        scn.close();
    }
}