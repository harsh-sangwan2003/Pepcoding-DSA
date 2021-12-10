import java.util.Scanner;

public class toggleCase {

    public static String toggle(String str) {

        String ans = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                ans += Character.toUpperCase(ch);

            else
                ans += Character.toLowerCase(ch);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(toggle(str));
        scn.close();
    }

}