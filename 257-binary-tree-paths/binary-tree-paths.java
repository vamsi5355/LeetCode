class Solution {
    List<String> res = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        backtrack(root, new StringBuilder());
        return res;
    }

    public void backtrack(TreeNode node, StringBuilder sb) {
        if (node == null) return;

        int len = sb.length();   
        sb.append(node.val);

        if (node.left == null && node.right == null) {
            res.add(sb.toString());
        } else {
            sb.append("->");
            backtrack(node.left, sb);
            backtrack(node.right, sb);
        }

        sb.setLength(len);
    }
}