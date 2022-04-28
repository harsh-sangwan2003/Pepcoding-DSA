import java.util.*;

public class digitFreq {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);

        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here

        int count = 0;

        while (n != 0) {

            int rem = n % 10;
            n /= 10;

            if (d == rem)
                count++;
        }

        return count;
    }
}