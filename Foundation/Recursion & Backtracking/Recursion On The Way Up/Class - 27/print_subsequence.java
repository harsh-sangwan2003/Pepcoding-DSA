import java.util.Scanner;

public class print_subsequence {

    public static void subsequence(String str, String ans) {

        if (str.length() == 0) {

            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        subsequence(ros, ans + ch);
        subsequence(ros, ans + "");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        subsequence(str, "");

        scn.close();
    }
}