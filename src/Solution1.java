import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public List<Integer> res = new ArrayList<>();
    public void findEachNodeBalanceFactor(TreeNode root){
        if(root == null) return;
        res.add(findBalanceFactor(root));
        System.out.println("Node Value: " + root.val + " Height: " + maxDepth(root) + " Balance Factor: " + findBalanceFactor(root));
        findEachNodeBalanceFactor(root.left);
        findEachNodeBalanceFactor(root.right);
    }
    public int findBalanceFactor(TreeNode root){
        if(root == null) return 0;
        return Math.abs(maxDepth(root.left) - maxDepth(root.right));
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }
}
