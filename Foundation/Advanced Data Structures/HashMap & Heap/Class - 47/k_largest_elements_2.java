//Time - O(nlog(k))
//Space - O(log(k))

import java.util.Scanner;
import java.util.PriorityQueue;

import java.io.IOException;

public class k_largest_elements_2 {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        solve(n, num, k);

        scn.close();
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array,n length of array and k.
    // It should print required output.
    public static void solve(int n, int[] arr, int k) {
        // Write your code here

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int val : arr) {

            if (pq.size() < k)
                pq.add(val);

            else {

                if (val > pq.peek()) {

                    pq.remove();
                    pq.add(val);
                }
            }
        }

        while (pq.size() != 0) {

            System.out.println(pq.remove());
        }

    }
}