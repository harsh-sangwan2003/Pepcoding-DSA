import java.util.Scanner;

public class print_encodings {

    public static void encodings(String str, String ans) {

        if (str.length() == 0) {

            System.out.println(ans);
            return;
        }

        if (str.charAt(0) == '0')
            return;

        char ch = str.charAt(0);
        int chv = ch - '0';
        char code = (char) ('a' + chv - 1);
        String ros = str.substring(1);
        encodings(ros, ans + code);

        if (str.length() > 1) {

            char ch2 = str.charAt(1);
            int chv2 = ch2 - '0';
            int val = chv * 10 + chv2;

            if (val <= 26) {
                char finalCode = (char) ('a' + val - 1);
                String ros2 = str.substring(2);
                encodings(ros2, ans + finalCode);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        encodings(str, "");

        scn.close();
    }
}
