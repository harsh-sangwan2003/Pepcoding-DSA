import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static class Pair {

        int v1, v2;

        Pair() {

        }

        Pair(int v1, int v2) {

            this.v1 = v1;
            this.v2 = v2;
        }
    }

    public static void test1() {

        // Min
        // PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {

        // return a.v1 - b.v1;
        // });

        // Max
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {

            if (a.v1 != b.v1)
                return a.v1 - b.v1;

            else
                return a.v2 - b.v2;
        });

        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {

            int a = scn.nextInt();
            int b = scn.nextInt();

            pq.add(new Pair(a, b));
        }

        while (pq.size() != 0) {
            Pair p = pq.remove();
            System.out.println(p.v1 + ", " + p.v2);
        }
    }

    public static void main(String[] args) {

        test1();
    }
}