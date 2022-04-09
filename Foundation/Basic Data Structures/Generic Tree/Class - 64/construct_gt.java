import java.util.Stack;
import java.util.ArrayList;

public class construct_gt {

    public static class Node {

        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node() {

        }

        Node(int data) {

            this.data = data;
        }
    }

    public static Node construct(Integer[] arr) {

        Stack<Node> st = new Stack<>();
        Node root = null;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1)
                st.pop();

            else {

                Node temp = new Node(arr[i]);

                if (st.size() == 0)
                    root = temp;

                else {

                    st.peek().children.add(temp);
                }

                st.push(temp);
            }
        }

        return root;
    }

    public static void main(String[] args) {

        Integer[] arr = { 10, 20, -1, 30, 50, -1, -1, 40, -1, -1 };

        Node root = construct(arr);

        System.out.println(root.data);

    }
}