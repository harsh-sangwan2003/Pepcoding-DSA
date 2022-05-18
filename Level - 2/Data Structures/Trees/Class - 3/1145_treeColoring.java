//O(n)
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

    int countXLeft;
    int countXRight;

    public int size(TreeNode root, int x) {

        if (root == null)
            return 0;

        int lc = size(root.left, x);
        int rc = size(root.right, x);

        if (root.val == x) {

            countXLeft = lc;
            countXRight = rc;
        }

        return lc + rc + 1;
    }

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {

        int parentCount = n - (countXLeft + countXRight + 1);
        int max = Math.max(parentCount, Math.max(countXLeft, countXRight));

        int restCount = n - max;

        if (max > restCount)
            return true;

        return false;
    }

    public int size(TreeNode root) {

        if (root == null)
            return 0;

        int lc = size(root.left);
        int rc = size(root.right);

        return lc + rc + 1;
    }

    public boolean btreeGameWinningMove2(TreeNode root, int n, int x) {

        if (root == null)
            return false;

        if (root.val == x) {

            int op1 = size(root.left);
            int op2 = size(root.right);
            int op3 = n - op1 - op2 - 1;

            int max = Math.max(op1, Math.max(op2, op3));

            if (max > n / 2)
                return true;

            return false;
        }

        boolean left = btreeGameWinningMove(root.left, n, x);
        boolean right = btreeGameWinningMove(root.right, n, x);

        return left || right;
    }
}