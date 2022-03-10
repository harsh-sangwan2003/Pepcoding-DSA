import java.util.Stack;

public class syntax {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        // Stack overflow ->
        /*
         * st.push(10);
         * st.push(20);
         * st.push(30);
         * st.push(40);
         * 
         * while (true) {
         * 
         * st.push(10);
         * }
         */

        // Stack underflow ->
        System.out.println(st.peek());

    }
}