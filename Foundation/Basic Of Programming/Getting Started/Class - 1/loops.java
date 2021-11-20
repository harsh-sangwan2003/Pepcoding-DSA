import java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Increasing no from 1 to 10");
        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
        }

        System.out.println("Decreasing no from 1 to 10");
        for (int i = 10; i >= 1; i--) {

            System.out.println(i);
        }

        System.out.println("Table");
        int tableNumber = scn.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNumber + " X " + i + " = " + tableNumber * i);
        }

        scn.close();
    }
}
