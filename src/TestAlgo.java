import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAlgo {
    public static void main(String[] args) {
        StrToTreeNode strToTreeNode = new StrToTreeNode();
        TreeNode root = strToTreeNode.createTree("10,5,-3,100,2,null,11,3,null,1,null,null,null,1,null,null,3,2");
        Solution1 solution1 = new Solution1();
        solution1.findEachNodeBalanceFactor(root);
        System.out.println(solution1.res);
        int[] arr1 = new int[]{3,23,1,345,2,15,4,56,53,2345,6,2,13,2};
        System.out.println(Arrays.toString(arr1));
        Solution3 solution3 = new Solution3();
        solution3.heapSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[]{3,23,1,345,2,15,4,56,53,2345,6,2,13,2};
        System.out.println(Arrays.toString(arr2));
        Solution4 solution4 = new Solution4();
        int k = solution4.heapSelect(arr2, 9);
        System.out.println(k);
        int[] arr = new int[]{3,23,1,345,2,15,4,56,53,2345,6,2,13,2};
        Solution2 solution2 = new Solution2();
        long start = System.currentTimeMillis();
        System.out.println(solution2.subsets(arr));
        System.out.println((System.currentTimeMillis() - start) / 1000.0 + "s");
    }
}
