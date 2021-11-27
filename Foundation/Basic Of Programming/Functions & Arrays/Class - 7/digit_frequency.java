import java.util.Scanner;

public class digit_frequency {

    public static int countFreq(int num, int d) {

        int count = 0;

        while (num != 0) {

            int ld = num % 10;

            if (ld == d) {

                count++;
            }

            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int d = scn.nextInt();

        System.out.println(countFreq(num, d));
        scn.close();
    }
}