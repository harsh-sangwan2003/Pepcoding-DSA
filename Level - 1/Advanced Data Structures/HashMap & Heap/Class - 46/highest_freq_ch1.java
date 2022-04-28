//Time - O(n)
//Space - O(26)

import java.util.Scanner;

public class highest_freq_ch1 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            freq[ch - 'a']++;
        }

        char ans = 'a';
        int max_f = -1;

        for (int i = 0; i < freq.length; i++) {

            if (freq[i] > max_f) {

                max_f = Math.max(max_f, freq[i]);
                ans = (char) ('a' + i);
            }
        }

        System.out.println(ans);

        scn.close();

    }

}