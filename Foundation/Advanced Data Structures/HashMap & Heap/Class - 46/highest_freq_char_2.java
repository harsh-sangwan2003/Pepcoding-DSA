//Time - O(n)
//Space - O(n)

import java.util.Scanner;

public class highest_freq_char_2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int idx = ch - 'a';

            freq[idx]++;
        }

        int maxCount = -1;
        char ans = 'a';

        for (int i = 0; i < freq.length; i++) {

            int count = freq[i];

            if (count > maxCount) {

                maxCount = count;
                ans = (char) ('a' + i);
            }
        }

        System.out.println(ans);
        scn.close();
    }

}