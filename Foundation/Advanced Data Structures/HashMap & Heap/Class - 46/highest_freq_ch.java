//Time - O(n)
//Space - O(n)

import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

public class highest_freq_ch {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        char ans = 'a';

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!map.containsKey(ch))
                map.put(ch, 1);

            else {

                int val = map.get(ch);
                map.put(ch, val + 1);
            }
        }

        Set<Character> set = map.keySet();
        int max = -1;

        for (char ch : set) {

            int val = map.get(ch);

            if (val > max) {

                max = val;
                ans = ch;
            }
        }

        System.out.println(ans);

        scn.close();
    }

}