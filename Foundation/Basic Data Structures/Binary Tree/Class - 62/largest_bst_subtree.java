import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;

public class largest_bst_subtree {
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

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static class Pair2 {

        Node node;
        boolean isBst;
        int size;
        int max;
        int min;

        Pair2() {

        }

        Pair2(Node node, boolean isBst, int size, int max, int min) {

            this.node = node;
            this.isBst = isBst;
            this.size = size;
            this.max = max;
            this.min = min;
        }

    }

    public static Pair2 fn(Node root) {

        if (root == null)
            return new Pair2(null, true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);

        Pair2 lp = fn(root.left);
        Pair2 rp = fn(root.right);

        Pair2 mp = new Pair2();
        mp.isBst = lp.isBst && rp.isBst && (root.data >= lp.max && root.data <= rp.min);
        mp.min = Math.min(root.data, lp.min);
        mp.max = Math.max(root.data, rp.max);

        if (mp.isBst) {

            mp.node = root;
            mp.size = lp.size + rp.size + 1;
        }

        else if (lp.size > rp.size) {

            mp.node = lp.node;
            mp.size = lp.size;
        }

        else {

            mp.node = rp.node;
            mp.size = rp.size;
        }

        return mp;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);

        // write your code here
        Pair2 ansP = fn(root);
        System.out.println(ansP.node.data + "@" + ansP.size);
    }

}