import java.util.Stack;

public class construct_tree {

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

    public static void main(String[] args) {

        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };

        Node rtp = new Node(arr[0], null, null);
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(rtp, 1));

        int idx = 0;

        while (st.size() != 0) {

            Pair p = st.peek();

            if (p.state == 1) {

                if (arr[idx] != null) {

                    idx++;

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

                if (arr[idx] != null) {

                    idx++;

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

                st.pop();
            }
        }

    }
}
