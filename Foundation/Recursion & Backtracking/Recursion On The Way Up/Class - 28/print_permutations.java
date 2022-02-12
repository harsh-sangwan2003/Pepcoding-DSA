//Time - O(n!)
//Space - O(n)

import java.util.*;

public class print_permutations {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        printPermutations(str, "");

        scn.close();
    }

    public static void printPermutations(String str, String asf) {

        if (str.length() == 0) {

            System.out.println(asf);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            String ros = left + right;

            printPermutations(ros, asf + str.charAt(i));
        }
    }

}