import java.util.Scanner;

public class stringCompression {

    public static String comp1(String str) {

        char st = str.charAt(0);
        StringBuilder ans = new StringBuilder();
        ans.append(st);

        for (int i = 1; i < str.length(); i++) {

            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (prev != curr)
                ans.append(curr);
        }

        return ans.toString();
    }

    public static String comp2(String str) {

        char st = str.charAt(0);
        StringBuilder ans = new StringBuilder();
        ans.append(st);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (prev != curr) {

                if (count > 1)
                    ans.append(count);

                ans.append(curr);
                count = 1;
            }

            else {

                count++;
            }
        }

        if (count > 1)
            ans.append(count);

        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String c1 = comp1(str);
        System.out.println(c1);

        String c2 = comp2(str);
        System.out.println(c2);
        scn.close();
    }
}