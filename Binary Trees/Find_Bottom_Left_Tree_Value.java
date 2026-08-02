class Solution 
{
    int maxDepth = -1;
    int bottomLeft = 0;

    public int findBottomLeftValue(TreeNode root) 
    {
        DFS(root, 0);
        return bottomLeft;
    }

    public void DFS(TreeNode root, int currDepth) 
    {
        if (root == null) 
        {
            return;
        }

        if (currDepth > maxDepth) 
        {
            maxDepth = currDepth;
            bottomLeft = root.val;
        }

        DFS(root.left, currDepth + 1);
        DFS(root.right, currDepth + 1);
    }
}

/*
 * 
 * Approach 2 using BFS that is using queue and level order traversal (No Rcursion)
 * 
 * Queue<TreeNode> q = new ArrayDeque<>();
 * 
 * q.add(root);
 * 
 * int left_most = 0;
 * 
 * while(q.size() > 0)
 * {
 * int size = q.size();
 * left_most = q.peek().val;
 * for(int i=0; i<size; i++)
 * {
 * TreeNode temp = q.poll();
 * if(temp.left!=null) q.add(temp.left);
 * if(temp.right!=null) q.add(temp.right);
 * }
 * }
 * return left_most;
 * 
 */