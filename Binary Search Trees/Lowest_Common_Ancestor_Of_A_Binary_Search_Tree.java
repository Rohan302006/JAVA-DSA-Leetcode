class Solution 
{  
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        while(root != null)
        {
            // LCA will lie toward the left subtree
            if (p.val < root.val && q.val < root.val) 
            {
                root = root.left;
            }

            // LCA will lie toward right side 
            else if (p.val > root.val && q.val > root.val) 
            {
                root = root.right;
            }

            // p and q both are on different sides of the tree
            // OR The Root itself will be the LCA or the root itself is p or q

            else {
                return root;
            }
        }
        
        // Tree is empty
        return null;
    }
}


/*

    Simple Recursive Solution

    class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}

 */