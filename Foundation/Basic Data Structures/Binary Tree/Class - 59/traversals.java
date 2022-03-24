import java.util.Stack;

public class traversals {

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

    public static void preOrder(Node root) {

        if (root == null)
            return;

        System.out.println(root.data);

        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {

        if (root == null)
            return;

        inOrder(root.left);

        System.out.println(root.data);

        inOrder(root.right);
    }

    public static void postOrder(Node root) {

        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);

        System.out.println(root.data);
    }

    public static void main(String[] args) {

        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };

        Node root = construct(arr);

        preOrder(root);
        System.out.println("----------------");

        inOrder(root);
        System.out.println("----------------");

        postOrder(root);
        System.out.println("----------------");
    }
}
