import java.util.Scanner;

public class digitsOfNumber {

    public static void reverseOfNumber(int num) {

        while (num != 0) {

            int ld = num % 10;
            num /= 10;
            System.out.println(ld);
        }
    }

    public static void main(String[] args) {

        Scanner snc = new Scanner(System.in);
        int num = scn.nextInt();

    }
}
