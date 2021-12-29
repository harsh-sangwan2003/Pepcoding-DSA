import java.util.Scanner;

public class print_Permutations {

    public static void permutaions(String str, String ans) {

        if (str.length() == 0) {

            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String ros = left + right;

            permutaions(ros, ans + ch);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        permutaions(str, "");
        scn.close();
    }
}
