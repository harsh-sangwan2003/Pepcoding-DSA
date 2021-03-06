import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;

public class celebrity_problem {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);
        br.close();
    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++)
            st.push(i);

        while (st.size() > 1) {

            int i = st.pop();
            int j = st.pop();

            if (arr[i][j] == 1)
                st.push(j);

            else
                st.push(i);
        }

        int pans = st.pop();

        for (int i = 0; i < arr.length; i++) {

            if (i != pans && (arr[i][pans] == 0 || arr[pans][i] == 1)) {
                System.out.println("none");
                return;
            }
        }

        System.out.println(pans);
    }

}