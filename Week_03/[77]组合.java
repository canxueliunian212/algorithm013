//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。 
//
// 示例: 
//
// 输入: n = 4, k = 2
//输出:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
// Related Topics 回溯算法 
// 👍 330 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> output = new LinkedList<List<Integer>>();
    int n;
    int k;

    private void backtrack (int first, LinkedList<Integer> curr) {
        if (curr.size() == k) {
            output.add(new LinkedList<Integer>(curr));
        }

        for (int i=first;i<n+1;i++) {
            curr.add(i);
            backtrack(i + 1,curr);
            curr.removeLast();
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;

        backtrack(1,new LinkedList<Integer>());
        return output;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
// 时间复杂度 O(n)
// 空间复杂度 O(n)
