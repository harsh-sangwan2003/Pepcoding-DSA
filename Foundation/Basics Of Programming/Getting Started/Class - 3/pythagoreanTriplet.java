// Time - O(1)
// Space - O(1)

import java.util.Scanner;

public class pythagoreanTriplet {

    public static boolean checkTriplet(int a, int b, int c) {

        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
            return true;

        else
            return false;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt(), c = scn.nextInt();

        System.out.println(checkTriplet(a, b, c));
        scn.close();
    }
}
