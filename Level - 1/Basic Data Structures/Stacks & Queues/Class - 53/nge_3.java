import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;

public class nge_3 {
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
        nge[arr.length - 1] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {

            while (st.size() > 0 && arr[i] >= arr[st.peek()])
                st.pop();

            if (st.size() == 0)
                nge[i] = -1;

            else
                nge[i] = arr[st.peek()];

            st.push(i);
        }

        return nge;
    }

}