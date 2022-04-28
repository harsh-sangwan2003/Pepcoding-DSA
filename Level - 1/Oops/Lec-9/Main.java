import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void test1() {

        Integer[] arr = { 2, 5, 1, -1, 0, 5, 3, 2, 5, -4, 3 };
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(list);
        int n = list.size();

        for (int i = 0; i < n; i++)
            System.out.print(list.get(i) + " ");

        System.out.println();
    }

    public static void test2() {

        Integer[] arr = { 2, 5, 1, -1, 0, 5, 3, 2, 5, -4, 3 };

        Arrays.sort(arr, (a, b) -> b - a);

        System.out.println(Arrays.toString(arr));
    }

    public static void test3() {

        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        ArrayList<String> list = new ArrayList<>(Arrays.asList(months));

        Collections.sort(list, (a, b) -> a.length() - b.length());

        int n = list.size();

        for (int i = 0; i < n; i++)
            System.out.print(list.get(i) + " ");

        System.out.println();
    }

    public static class Pair {

        int v1, v2;

        Pair(int v1, int v2) {

            this.v1 = v1;
            this.v2 = v2;
        }
    }

    public static void test4() {

        ArrayList<Pair> list = new ArrayList<>();
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {

            int a = scn.nextInt();
            int b = scn.nextInt();

            list.add(new Pair(a, b));
        }

        Collections.sort(list, (a, b) -> {

            if (a.v1 != b.v1)
                return a.v1 - b.v1;

            return b.v2 - a.v2;
        });

        for (int i = 0; i < n; i++) {

            Pair p = list.get(i);
            System.out.println(p.v1 + " " + p.v2);
        }

    }

    public static void main(String[] args) {

        test1();
        test2();
        test3();
        test4();
    }
}