package Extra;

import java.util.Scanner;

public class printSubstrings {

    public static void Substrings(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {

                System.out.println(str.substring(i, j + 1));
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Substrings(str);
        scn.close();
    }
}
