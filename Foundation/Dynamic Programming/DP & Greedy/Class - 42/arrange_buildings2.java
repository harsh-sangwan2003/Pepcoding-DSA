//Time - O(n)
//Space - O(1)

import java.util.Scanner;

public class arrange_buildings2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        long oldB = 1;
        long oldS = 1;

        for (int i = 2; i <= n; i++) {

            long newS = oldB + oldS;
            long newB = oldS;

            oldB = newB;
            oldS = newS;
        }

        long total = oldB + oldS;
        total = total * total;

        System.out.println(total);

        scn.close();
    }

}