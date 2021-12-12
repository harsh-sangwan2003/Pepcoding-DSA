import java.util.Scanner;
import java.util.ArrayList;

public class removePrime {

    public static boolean isPrime(int num) {

        for (int n = 2; n * n <= num; n++) {
            if (num % n == 0)
                return false;
        }

        return true;
    }

    public static void remove(ArrayList<Integer> list) {

        for (int i = list.size() - 1; i >= 0; i--) {

            int val = list.get(i);

            if (isPrime(val)) {

                list.remove(i);
            }
        }
    }

    public static void display(ArrayList<Integer> list) {

        System.out.println(list);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(scn.nextInt());

        remove(list);
        display(list);

        scn.close();
    }
}
