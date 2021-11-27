import java.util.Scanner;

public class decimalToBinary {

    public static int decToBin(int num) {

        int ans = 0;
        int pow = 1;

        while (num != 0) {

            int rem = num % 2;
            ans += rem * pow;
            pow *= 10;
            num /= 2;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        System.out.println(decToBin(num));
        scn.close();
    }
}