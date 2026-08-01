class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            int n = queue.size();
            TreeNode rightNode = null;

            while (n-- > 0) {

                rightNode = queue.poll();

                if (rightNode.left != null) {
                    queue.offer(rightNode.left);
                }

                if (rightNode.right != null) {
                    queue.offer(rightNode.right);
                }
            }

            result.add(rightNode.val);
        }

        return result;
    }
}
