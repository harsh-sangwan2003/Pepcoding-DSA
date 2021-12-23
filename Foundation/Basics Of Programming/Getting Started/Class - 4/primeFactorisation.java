import java.util.Scanner;

public class primeFactorisation {

    public static void factorise(int num) {

        for (int i = 2; i * i <= num; i++) {

            int temp = i;
            while (num % temp == 0) {

                System.out.print(temp + " ");
                num /= temp;
            }
        }

        if (num != 1)
            System.out.println(num);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        factorise(n);
        scn.close();
    }
}