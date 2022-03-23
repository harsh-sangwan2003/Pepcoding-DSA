import java.util.Stack;

public class display {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {

            this.data = data;
        }

    }

    public static class Pair {

        Node node;
        int state;

        Pair(Node node, int state) {

            this.node = node;
            this.state = state;
        }

    }

    public static Node constructTree(Integer[] arr) {

        Node root = new Node(arr[0]);
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        int idx = 1;

        while (st.size() != 0) {

            Pair top = st.peek();

            if (top.state == 1) {

                if (arr[idx] != null) {

                    Node left = new Node(arr[idx]);
                    top.node.left = left;

                    Pair tmp = new Pair(left, 1);
                    st.push(tmp);
                }

                top.state++;
                idx++;
            }

            else if (top.state == 2) {

                if (arr[idx] != null) {

                    Node right = new Node(arr[idx]);
                    top.node.right = right;

                    Pair tmp = new Pair(right, 1);
                    st.push(tmp);
                }

                top.state++;
                idx++;
            }

            else {

                st.pop();
            }
        }

        return root;

    }

    public static void displayTree(Node node) {

        if (node == null)
            return;

        String str = "";

        str += node.left == null ? "." : node.left.data + "";
        str += " -> " + node.data + " <- " + "";
        str += node.right == null ? "." : node.right.data + "";

        System.out.println(str);

        displayTree(node.left);
        displayTree(node.right);
    }

    public static void main(String[] args) {

        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };

        Node node = constructTree(arr);

        displayTree(node);
    }
}
