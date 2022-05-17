import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node node) {
        // code here
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        Stack<Node> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        while (q.size() != 0) {

            Node temp = q.remove();

            st.push(temp);

            if (temp.right != null)
                q.add(temp.right);

            if (temp.left != null)
                q.add(temp.left);
        }

        while (st.size() != 0) {

            Node temp = st.pop();
            list.add(temp.data);
        }

        return list;
    }
}