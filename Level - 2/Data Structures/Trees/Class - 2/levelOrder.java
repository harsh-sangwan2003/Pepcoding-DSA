import java.io.*;
import java.util.*;

public class levelOrder {
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

    // LOLW - count
    public static void levelOrder1(Node node) {
        // write your code here
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (q.size() != 0) {

            int sz = q.size();

            while (sz-- > 0) {

                Node temp = q.remove();

                System.out.print(temp.data + " ");

                if (temp.left != null)
                    q.add(temp.left);

                if (temp.right != null)
                    q.add(temp.right);
            }

            System.out.println();

        }

    }

    // LOLW - null
    public static void levelOrder2(Node node) {
        // write your code here
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);

        while (q.size() != 0) {

            Node temp = q.remove();

            if (temp == null) {

                if (q.size() != 0) {

                    System.out.println();
                    q.add(null);
                }
            }

            else {

                System.out.print(temp.data + " ");

                if (temp.left != null)
                    q.add(temp.left);

                if (temp.right != null)
                    q.add(temp.right);
            }
        }

    }

    public static class LolwPair {

        Node node;
        int lvl;

        LolwPair(Node node, int lvl) {

            this.node = node;
            this.lvl = lvl;
        }
    }

    // LOLW - Pair
    public static void levelOrder3(Node node) {
        // write your code here
        Queue<LolwPair> q = new LinkedList<>();
        q.add(new LolwPair(node, 0));
        int currLvl = 0;

        while (q.size() != 0) {

            LolwPair rm = q.remove();

            if (rm.lvl != currLvl) {

                System.out.println();
                currLvl = rm.lvl;
            }

            System.out.print(rm.node.data + " ");

            if (rm.node.left != null)
                q.add(new LolwPair(rm.node.left, rm.lvl + 1));

            if (rm.node.right != null)
                q.add(new LolwPair(rm.node.right, rm.lvl + 1));
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

        Node root = construct(arr);
        levelOrder3(root);
    }

}