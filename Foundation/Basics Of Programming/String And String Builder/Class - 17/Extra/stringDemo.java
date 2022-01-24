package Extra;

import java.util.Scanner;

public class stringDemo {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Declaration
        // String s1 = "hello";
        String s = scn.nextLine();

        // length is a function in case of string
        System.out.println(s.length());

        // To access a character
        System.out.println(s.charAt(0));

        // Cannot change string character
        // s.charAt(0) = 'p';

        // Substring
        System.out.println(s.substring(1, 3));
        // Blank
        System.out.println(s.substring(1, 1));

        // Concat strings
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + " " + s2);

        // Split
        String s3 = "abc def ghi";
        String[] parts = s3.split(" ");

        for (int i = 0; i < parts.length; i++)
            System.out.println(parts[i]);

        scn.close();
    }
}