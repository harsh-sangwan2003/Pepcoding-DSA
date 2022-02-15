//Time - O(n)
//SPace - O(n)

import java.util.Scanner;
import java.util.HashMap;

public class get_common_ele2 {

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

        for (int val : a1) {

            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for (int val : a2) {

            if (map.containsKey(val) && map.get(val) > 0) {

                System.out.println(val);
                map.put(val, map.get(val) - 1);
            }
        }

        scn.close();
    }

}