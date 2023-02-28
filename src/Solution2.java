import java.util.LinkedList;
import java.util.List;

class Solution2 {
    List<List<Integer>> res = new LinkedList<>();
    List<Integer> track = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums, 0, track);
        return res;
    }

    public void backtracking(int[] nums, int start, List<Integer> track){

        res.add(new LinkedList<>(track));

        for(int i = start; i < nums.length; i++){
            track.add(nums[i]);
            backtracking(nums, i + 1, track);
            track.remove(track.size() - 1);
        }
    }
}