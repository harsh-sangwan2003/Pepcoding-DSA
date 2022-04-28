//Time - O(n)
//Space - O(n)

import java.util.Scanner;
import java.util.HashMap;

public class highest_freq_ch2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 1) + 1);
        }

        char ans = 'a';
        int max_f = -1;

        for (char s : map.keySet()) {

            int freq = map.get(s);

            if (freq > max_f) {

                max_f = freq;
                ans = s;
            }
        }

        System.out.println(ans);

        scn.close();

    }

}