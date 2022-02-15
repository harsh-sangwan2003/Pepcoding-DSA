//Time - O(n)
//Space - O(n)

import java.util.Scanner;
import java.util.HashMap;

public class get_common_ele1 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++)
            a1[i] = scn.nextInt();

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];

        for (int i = 0; i < n2; i++)
            a2[i] = scn.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a1.length; i++) {

            map.put(a1[i], 1);
        }

        for (int i = 0; i < a2.length; i++) {

            int val = a2[i];

            if (map.containsKey(val)) {

                int occ = map.get(val);

                if (occ == 1) {

                    map.put(val, 0);
                    System.out.println(val);
                }
            }

        }

        scn.close();
    }

}