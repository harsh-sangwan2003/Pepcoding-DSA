import java.util.Scanner;

public class reverseNumber {

    public static void reverse(int num) {

        while (num != 0) {

            int ld = num % 10;
            num /= 10;
            System.out.println(ld);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        reverse(num);
        scn.close();
    }
}