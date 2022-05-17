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

class Solution {
    static private class Pair {

        Node node;
        int horiz;

        Pair(Node node, int horiz) {

            this.node = node;
            this.horiz = horiz;
        }
    }

    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // add your code
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        ArrayList<Integer> res = new ArrayList<>();
        int lv = 0;
        int rv = 0;

        HashMap<Integer, Node> map = new HashMap<>();

        while (q.size() != 0) {

            Pair rm = q.remove();

            if (rm.horiz < lv)
                lv = rm.horiz;

            if (rm.horiz > rv)
                rv = rm.horiz;

            if (!map.containsKey(rm.horiz))
                map.put(rm.horiz, rm.node);

            if (rm.node.left != null)
                q.add(new Pair(rm.node.left, rm.horiz - 1));

            if (rm.node.right != null)
                q.add(new Pair(rm.node.right, rm.horiz + 1));
        }

        for (int i = lv; i <= rv; i++) {

            res.add(map.get(i).data);
        }

        return res;
    }
}