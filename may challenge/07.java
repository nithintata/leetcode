// Cousins in Binary Tree

class Solution {
    
    TreeNode x_parent = null;
    TreeNode y_parent = null;
    int x_depth = 0;
    int y_depth = 0;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null)
            return false;
        dfs(root, null, x, y, 0);
        
        if (x_depth != y_depth)
            return false;
        return x_parent != y_parent;
    }
    
    private void dfs(TreeNode root, TreeNode parent, int x, int y, int depth) {
        
        if (root == null)
            return;
        
        if (root.val == x) {
            x_parent = parent;
            x_depth = depth;
        }
        
        else if (root.val == y) {
            y_parent = parent;
            y_depth = depth;
        }
        
        dfs(root.left, root, x, y, depth + 1);
        dfs(root.right, root, x, y, depth + 1);
    }
}
