package Extra;

import java.util.Scanner;

public class allSubstrings {

    public static void printSubstrings(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printSubstrings(str);
        scn.close();
    }
}
