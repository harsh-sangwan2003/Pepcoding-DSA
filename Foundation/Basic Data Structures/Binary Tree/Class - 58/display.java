import java.util.Stack;

public class display {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {

            this.data = data;
            this.left = left;
            this.right = right;
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

        Node rtp = new Node(arr[0], null, null);
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(rtp, 1));

        int idx = 0;

        while (st.size() != 0 && idx < arr.length) {

            Pair p = st.peek();

            if (p.state == 1) {

                idx++;
                if (arr[idx] != null) {

                    Node tmp = new Node(arr[idx], null, null);
                    p.node.left = tmp;

                    Pair tp = new Pair(tmp, 1);
                    st.push(tp);
                }

                else {

                    p.node.left = null;
                }

                p.state++;
            }

            else if (p.state == 2) {

                idx++;

                if (arr[idx] != null) {

                    Node tmp = new Node(arr[idx], null, null);
                    p.node.right = tmp;

                    Pair tp = new Pair(tmp, 1);
                    st.push(tp);
                }

                else {

                    p.node.right = null;
                }

                p.state++;
            }

            else {

                idx++;
                st.pop();
            }
        }

        return rtp;
    }

    public static void displayTree(Node node) {

        if (node == null)
            return;

        String str = "";

        str += node.left == null ? "." : node.left.data + "";
        str += "->" + node.data + "<-" + "";
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
