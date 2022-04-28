import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;
import java.util.Arrays;

public class nge_2 {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);

        br.close();
    }

    public static int[] solve(int[] arr) {
        // solve
        int[] nge = new int[arr.length];
        Arrays.fill(nge, -1);
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (st.size() != 0 && arr[st.peek()] <= arr[i]) {

                int idx = st.pop();
                nge[idx] = arr[i];
            }

            st.push(i);
        }

        return nge;
    }

}