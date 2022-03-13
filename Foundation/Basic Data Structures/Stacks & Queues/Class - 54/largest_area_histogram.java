import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;

public class largest_area_histogram {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        // code
        int ans = largestRectangleArea(a);
        System.out.println(ans);

        br.close();
    }

    public static int largestRectangleArea(int[] arr) {

        int[] nsel = smallerElement(arr);
        int[] nser = smallerElement2(arr);

        int max_area = -1;

        for (int i = 0; i < arr.length; i++) {

            int width = nser[i] - nsel[i] - 1;
            int currArea = arr[i] * width;

            max_area = Math.max(max_area, currArea);
        }

        return max_area;
    }

    public static int[] smallerElement(int[] arr) {

        int[] nse = new int[arr.length];
        nse[0] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i = 1; i < arr.length; i++) {

            while (st.size() != 0 && arr[i] <= arr[st.peek()])
                st.pop();

            if (st.size() == 0)
                nse[i] = -1;

            else
                nse[i] = st.peek();

            st.push(i);
        }

        return nse;
    }

    public static int[] smallerElement2(int[] arr) {

        int[] nse = new int[arr.length];
        nse[arr.length - 1] = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {

            while (st.size() != 0 && arr[i] <= arr[st.peek()])
                st.pop();

            if (st.size() == 0)
                nse[i] = arr.length;

            else
                nse[i] = st.peek();

            st.push(i);
        }

        return nse;
    }

}