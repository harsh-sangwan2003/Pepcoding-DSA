import java.util.PriorityQueue;
import java.util.Collections;

public class priorityQueue {

    public static void main(String[] args) {

        int[] arr = { 1, 21, 57, 92, 13, 43, 22, 21, 6 };

        // default behaviour - minPQ
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int ele : arr)
            pq.add(ele);

        while (pq.size() != 0)
            System.out.println(pq.remove());
    }
}
