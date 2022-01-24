import java.util.Scanner;

public class toggleString {

    public static String toggle(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                char c = (char) (ch - 32);
                sb.append(c);
            }

            else {
                char c = (char) (ch + 32);
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String s = toggle(str);
        System.out.println(s);

        scn.close();
    }
}