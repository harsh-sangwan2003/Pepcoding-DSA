//TIme - O(n)
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

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i] - 1))
                map.put(arr[i], false);

            else
                map.put(arr[i], true);
        }

        int max_len = 0;
        int st = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean flag = map.get(arr[i]);
            int len = 1;

            if (flag) {

                while (map.containsKey(arr[i] + len)) {

                    len++;
                }
            }

            if (len > max_len) {

                max_len = len;
                st = arr[i];
            }
        }

        for (int i = 0; i < max_len; i++)
            System.out.println(st + i);

        scn.close();
    }

}