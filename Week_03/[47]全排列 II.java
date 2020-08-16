//给定一个可包含重复数字的序列，返回所有不重复的全排列。 
//
// 示例: 
//
// 输入: [1,1,2]
//输出:
//[
//  [1,1,2],
//  [1,2,1],
//  [2,1,1]
//] 
// Related Topics 回溯算法 
// 👍 373 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> output = new ArrayList<List<Integer>>();
    int[] nums;
    public List<List<Integer>> permuteUnique(int[] nums) {
        this.nums = nums;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        boolean[] flag = new boolean[nums.length];
        dfs(list,flag,0);
        return output;
    }

    private void dfs (List<Integer> list,boolean[] flag,int length) {
        if (length == nums.length) {
            output.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i=0;i<nums.length;i++) {
            if (flag[i]) continue;

            if (i>0 && nums[i-1] == nums[i] && flag[i-1] == false) continue;

            list.add(nums[i]);
            flag[i] = true;
            dfs(list,flag,length +1);
            list.remove(list.size() -1);
            flag[i] = false;
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)
// 时间复杂度 O(n * n!)
// 空间复杂度 O(n * n!)
