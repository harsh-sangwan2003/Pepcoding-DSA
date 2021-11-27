import java.util.Scanner;

public class anyBaseToDec {

    public static int anyToDec(int num, int b) {

        int ans = 0;
        int pow = 1;

        while (num != 0) {

            int rem = num % 10;
            num /= 10;

            ans += rem * pow;
            pow *= b;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(anyToDec(num, b));
        scn.close();
    }
}