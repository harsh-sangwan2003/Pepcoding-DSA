package Extra;

import java.util.Scanner;

public class isPalindrome {

    public static boolean palindrome(String str) {

        int lo = 0;
        int hi = str.length() - 1;

        while (lo <= hi) {

            char st = str.charAt(lo);
            char en = str.charAt(hi);

            if (st != en)
                return false;

            lo++;
            hi--;
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        boolean flag = palindrome(str);

        if (flag) {

            System.out.println(str + " is a palindromic string");
        }

        else {

            System.out.println(str + " is not a palindromic string");
        }
        scn.close();
    }
}
