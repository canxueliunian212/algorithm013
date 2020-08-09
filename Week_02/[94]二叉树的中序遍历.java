//给定一个二叉树，返回它的中序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,3,2] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 哈希表 
// 👍 616 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ouput = new ArrayList<Integer>();
        helper(root,ouput);
        return ouput;
    }

    private void helper(TreeNode root,List<Integer> output) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left,output);
            }
            output.add(root.val);
            if (root.right != null) {
                helper(root.right,output);
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
// 时间复杂度 O(n)
// 空间复杂度 O(logn)