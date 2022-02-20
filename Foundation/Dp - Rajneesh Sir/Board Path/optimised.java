//Time - O(n)
//Space - O(1)

import java.util.ArrayList;
import java.util.Scanner;

public class optimised {

    public static int board_path(int SP, int ep, int[] dp) {

        ArrayList<Integer> al = new ArrayList<>();

        for (int sp = ep; sp >= SP; sp--) {

            if (ep - sp <= 1) {

                al.add(0, 1);
            }

            else {

                if (al.size() < 7) {
                    int val = al.get(0);
                    al.add(0, 2 * val);
                }

                else {

                    int val1 = al.get(0);
                    int val2 = al.remove(al.size() - 1);
                    al.add(0, 2 * val1 - val2);
                }
            }

        }

        return al.get(0);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        int ans = board_path(0, n, dp);

        System.out.println(ans);

        // for (int val : dp)
        // System.out.print(val + " ");

        scn.close();
    }
}