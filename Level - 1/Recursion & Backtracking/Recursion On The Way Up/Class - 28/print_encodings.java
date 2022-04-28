//Time - O(2^n)
//Space - O(n)

import java.util.Scanner;

public class print_encodings {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printEncodings(str, "");
        scn.close();
    }

    public static void printEncodings(String str, String asf) {

        if (str.length() == 0) {

            System.out.println(asf);
            return;
        }

        if (str.charAt(0) == '0')
            return;

        char ch = str.charAt(0);
        String ros = str.substring(1);
        int chv = ch - '0';
        char code = (char) ('a' + chv - 1);

        printEncodings(ros, asf + code);

        if (str.length() >= 2) {

            char ch2 = str.charAt(1);
            String ros2 = str.substring(2);
            int chv2 = ch2 - '0';
            int chval = chv * 10 + chv2;

            if (chval <= 26) {

                char code2 = (char) ('a' + chval - 1);
                printEncodings(ros2, asf + code2);
            }
        }
    }

}