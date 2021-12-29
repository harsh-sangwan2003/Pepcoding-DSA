import java.util.Scanner;

public class print_Encodings {

    public static void encodings(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        if (str.charAt(0) == '0')
            return;

        char ch = str.charAt(0);
        int chv = ch - '0';
        char cval = (char) ('a' + chv - 1);

        encodings(str.substring(1), ans + cval);

        if (str.length() > 1) {

            char ch2 = str.charAt(1);
            int chv2 = ch2 - '0';

            int num = chv * 10 + chv2;
            char cval2 = (char) ('a' + num - 1);

            if (num <= 26)
                encodings(str.substring(2), ans + cval2);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        encodings(str, "");
        scn.close();
    }
}
