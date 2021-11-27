import java.util.Scanner;

public class binaryToDecimal {

    public static int binToDec(int num) {

        int pow = 1;
        int res = 0;

        while (num != 0) {

            int rem = num % 10;
            num /= 10;
            res += rem * pow;
            pow *= 2;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        System.out.println(binToDec(num));

        scn.close();
    }
}
