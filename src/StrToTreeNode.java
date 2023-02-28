import java.util.LinkedList;
import java.util.Queue;

/**
 * 使用方法：
 *  StrToTreeNode = new StrToTreeNode();
 *  TreeNode root = strToTreeNode.createTree("10,5,-3,3,2,null,11,3,-2,null,1");
 *  strToTreeNode.printTree(root);
 */
public class StrToTreeNode {
    public TreeNode createTree(String tree) {
        String[] ss = tree.split(",");
        return createTree(ss);
    }

    public TreeNode createTree(String[] tree) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = constructOne(tree[0]);
        q.add(root);
        int idx = 1;
        while (!q.isEmpty()) {
            TreeNode tn = q.poll();
            if (tn == null) {
                continue;
            }
            if (idx == tree.length) {
                break;
            }
            TreeNode left_ = constructOne(tree[idx]);
            tn.left = left_;
            q.add(left_);
            idx++;
            if (idx == tree.length) {
                break;
            }
            TreeNode right_ = constructOne(tree[idx]);
            idx++;
            tn.right = right_;
            q.add(right_);
        }
        return root;
    }
    private void printNode(TreeNode tn, int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("\t");
        }
        sb.append(tn.val);
        System.out.println(sb.toString());
    }
    public void printTree(TreeNode root, int indent) {
        if (root == null) {
            return;
        }
        printTree(root.right, indent + 1);
        printNode(root, indent);
        printTree(root.left, indent + 1);
    }
    private TreeNode constructOne(String s) {
        if (s.compareTo("null") == 0) {
            return null;
        } else {
            return new TreeNode(Integer.parseInt(s));
        }
    }
}

