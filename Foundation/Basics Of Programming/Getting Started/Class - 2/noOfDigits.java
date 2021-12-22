import java.util.Scanner;

public class noOfDigits {

    public static int countDigits(int num) {

        int count = 0;

        while (num != 0) {

            num /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        System.out.println(countDigits(num));
        scn.close();
    }
}