//Time - O(nlog(n))
//Space - O(Height of tree)

import java.util.PriorityQueue;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class merge_k_sorted_lists {

    public static class Triplet implements Comparable<Triplet> {

        int li;
        int di;
        int data;

        Triplet() {

        }

        public Triplet(int li, int di, int data) {

            this.li = li;
            this.di = di;
            this.data = data;
        }

        public int compareTo(Triplet o) {
            return this.data - o.data;
        }
    }

    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {
        ArrayList<Integer> rv = new ArrayList<>();

        // write your code here
        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        for (int i = 0; i < lists.size(); i++)
            pq.add(new Triplet(i, 0, lists.get(i).get(0)));

        while (pq.size() != 0) {

            Triplet tp = pq.remove();
            rv.add(tp.data);

            int newLi = tp.li;
            int newDi = tp.di + 1;

            if (newDi < lists.get(newLi).size()) {

                pq.add(new Triplet(newLi, newDi, lists.get(newLi).get(newDi)));
            }
        }

        return rv;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            String[] elements = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(elements[j]));
            }

            lists.add(list);
        }

        ArrayList<Integer> mlist = mergeKSortedLists(lists);
        for (int val : mlist) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}