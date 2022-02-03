import java.util.Scanner;

public class count_binary_strings {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int oldZeroCount = 1;
        int oldOneCount = 1;

        for (int i = 2; i <= n; i++) {

            int newZeroCount = oldOneCount;
            int newOneCount = oldZeroCount + oldOneCount;

            oldZeroCount = newZeroCount;
            oldOneCount = newOneCount;
        }

        int ans = oldZeroCount + oldOneCount;

        System.out.println(ans);

        scn.close();
    }

}