//Time - O(n)
//Space - O(n)

import java.util.Scanner;
import java.util.HashMap;

public class longest_cons_seq {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int val : arr)
            map.put(val, true);

        for (int val : arr) {

            if (map.containsKey(val - 1))
                map.put(val, false);
        }

        int st = 0;
        int max_len = 0;

        for (int val : arr) {

            boolean flag = map.get(val);

            if (flag) {

                int len = 1;

                while (map.containsKey(val + len))
                    len++;

                if (len > max_len) {
                    st = val;
                    max_len = len;
                }
            }
        }

        for (int i = 0; i < max_len; i++)
            System.out.println(st + i);

        scn.close();
    }

}