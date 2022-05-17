import java.util.*;

// A Binary Tree node
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Tree {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        // Your code here
        if (root == null)
            return new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        ArrayList<Integer> list = new ArrayList<>();

        while (q.size() != 0) {

            int sz = q.size();

            for (int i = 0; i < sz; i++) {

                Node node = q.remove();

                if (i == 0)
                    list.add(node.data);

                if (node.left != null)
                    q.add(node.left);

                if (node.right != null)
                    q.add(node.right);
            }

        }

        return list;
    }
}