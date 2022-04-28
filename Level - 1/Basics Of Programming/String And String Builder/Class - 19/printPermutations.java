import java.util.Scanner;

public class printPermutations {

    public static int factorial(int num) {

        int res = 1;

        for (int i = 2; i <= num; i++)
            res *= i;

        return res;
    }

    public static void solution(String str) {
        
        int end = factorial(str.length());

        for (int i = 0; i < end; i++) {

            int temp = i;
            StringBuilder sb = new StringBuilder(str);
            StringBuilder ans = new StringBuilder("");

            for (int div = str.length(); div >= 1; div--) {

                int rem = temp % div;
                temp /= div;

                char ch = sb.charAt(rem);
                sb.deleteCharAt(rem);

                ans.append(ch);
            }

            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        solution(str);

        scn.close();
    }

}