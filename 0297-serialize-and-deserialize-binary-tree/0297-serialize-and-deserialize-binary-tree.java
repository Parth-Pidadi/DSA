/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Serialize
    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        serializeHelper(root, res);
        return res.toString();
    }

    private void serializeHelper(TreeNode node, StringBuilder res) {
        if (node == null) {
            res.append("n,");
            return;
        }
        res.append(node.val + ",");
        serializeHelper(node.left, res);
        serializeHelper(node.right, res);
    }

    // Deserialize
    public TreeNode deserialize(String data) {
        String[] vals = data.split(",");
        return deserializeHelper(vals);
    }

    private int i = 0;
    private TreeNode deserializeHelper(String[] vals) {
        if (vals[i].equals("n")) {
            i++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(vals[i]));
        i++;
        node.left = deserializeHelper(vals);
        node.right = deserializeHelper(vals);
        return node;
    }
}