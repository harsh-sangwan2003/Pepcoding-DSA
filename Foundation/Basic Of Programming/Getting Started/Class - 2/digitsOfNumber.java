import java.util.Scanner;

public class digitsOfNumber {

    public static int countNoOfDigits(int num) {

        int count = 0;

        while (num != 0) {

            num /= 10;
            count++;
        }

        return count;
    }

    public static void printDigits(int num) {

        int nod = countNoOfDigits(num);
        int div = (int) Math.pow(10, nod - 1);

        while (nod-- > 0) {

            int firstDigit = num / div;
            num = num % div;
            div /= 10;

            System.out.println(firstDigit);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        printDigits(num);
        scn.close();
    }
}