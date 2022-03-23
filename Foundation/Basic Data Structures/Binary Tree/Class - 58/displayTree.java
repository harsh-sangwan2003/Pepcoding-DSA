import java.util.Stack;

public class displayTree {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node() {

        }

        Node(int data) {

            this.data = data;
        }

        Node(int data, Node left, Node right) {

            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {

        Node node;
        int state;

        Pair() {

        }

        Pair(Node node, int state) {

            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {

        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0]);
        st.push(new Pair(root, 1));

        int idx = 1;

        while (st.size() != 0) {

            Pair top = st.peek();

            if (top.state == 1) {

                if (arr[idx] != null) {

                    Node node = new Node(arr[idx]);
                    top.node.left = node;
                    st.push(new Pair(node, 1));

                }

                idx++;
                top.state++;
            }

            else if (top.state == 2) {

                if (arr[idx] != null) {

                    Node node = new Node(arr[idx]);
                    top.node.right = node;
                    st.push(new Pair(node, 1));

                }

                idx++;
                top.state++;
            }

            else {

                st.pop();
            }
        }

        return root;

    }

    public static void display(Node node) {

        if (node == null)
            return;

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " -> " + node.data + " <- ";
        str += node.right == null ? "." : node.right.data + "";

        System.err.println(str);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {

        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };

        Node root = construct(arr);

        display(root);
        // System.err.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
    }
}
