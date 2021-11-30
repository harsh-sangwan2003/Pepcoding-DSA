import java.util.*;

public class decToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);

        scn.close();
    }

    public static int getValueInBase(int n, int b) {
        // write code here

        int res = 0;
        int pow = 1;

        while (n != 0) {

            int rem = n % b;
            n /= b;

            res += rem * pow;
            pow *= 10;
        }

        return res;
    }
}