import java.util.Scanner;

public class stringCompression {

    public static String compression1(String str) {

        String ans = "" + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {

            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (curr != prev)
                ans += curr;
        }

        return ans;
    }

    public static String compression2(String str) {

        String ans = "" + str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (curr != prev) {

                if (count > 1)
                    ans += count;

                ans += curr;
                count = 1;
            }

            else {

                count++;
            }
        }

        if (count > 1)
            ans += count;

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(compression1(str));
        System.out.println(compression2(str));

        scn.close();
    }

}