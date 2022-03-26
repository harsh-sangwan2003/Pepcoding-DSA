import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;
import java.util.ArrayList;

public class print_k_node_away {
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

    public static ArrayList<Node> psf(Node node, int data) {

        if (node == null)
            return new ArrayList<>();

        if (node.data == data) {

            ArrayList<Node> bres = new ArrayList<>();
            bres.add(node);
            return bres;
        }

        ArrayList<Node> left = psf(node.left, data);
        if (left.size() != 0) {

            left.add(node);
            return left;
        }

        ArrayList<Node> right = psf(node.right, data);
        if (right.size() != 0) {

            right.add(node);
            return right;
        }

        return new ArrayList<>();
    }

    public static void printKLvl(Node node, Node flag, int k) {

        if (node == null || k < 0 || node == flag)
            return;

        if (k == 0)
            System.out.println(node.data);

        printKLvl(node.left, flag, k - 1);
        printKLvl(node.right, flag, k - 1);
    }

    public static void printKNodesFar(Node node, int data, int k) {
        // write your code here
        ArrayList<Node> list = psf(node, data);

        for (int i = 0; i < list.size(); i++) {

            printKLvl(list.get(i), i == 0 ? null : list.get(i - 1), k - i);
        }
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

        int data = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        Node root = construct(arr);
        printKNodesFar(root, data, k);
    }

}