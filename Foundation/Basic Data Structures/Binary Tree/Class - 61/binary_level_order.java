import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null)
            return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (q.size() != 0) {

            List<Integer> list = new ArrayList<>();

            int sz = q.size();

            for (int i = 0; i < sz; i++) {

                TreeNode node = q.remove();
                list.add(node.val);

                if (node.left != null)
                    q.add(node.left);

                if (node.right != null)
                    q.add(node.right);
            }

            res.add(list);
        }

        return res;
    }
}