class Solution 
{
    public int kthSmallest(TreeNode root, int k) 
    {
        Stack<TreeNode> st = new Stack<>();

        while (true) 
        {
            // we are going to left as possible to get the smallest value because it is BST
            // so the smallest value will be on left side

            while (root != null) 
            {
                st.push(root);
                root = root.left;
            }

            // Now the smallest node will be always on the top of stack
            root = st.pop(); // storing it in "root"

            k--; // decreasing the value of k

            if (k == 0) // so if k=0 we got the kth smallest value
            {
                return root.val;
            }
            // then we will move to the next right part of that specific node not to the
            // right side of main parent root
            
            root = root.right;
        }

    }
}