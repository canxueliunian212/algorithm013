//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串�?
//
// 示例: 
//
// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//] 
//
// 说明�?
//
// 
// 所有输入均为小写字母�?
// 不考虑答案输出的顺序�?
// 
// Related Topics 哈希�?字符�?
// 👍 420 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return Collections.emptyList();

        Map<String,List<String>> result = new HashMap<String,List<String>>();
        for (String str : strs) {
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!result.containsKey(key)) {
                result.put(key,new ArrayList<String>());
            }
            result.get(key).add(str);
        }
        return new ArrayList(result.values());
    }
}
//leetcode submit region end(Prohibit modification and deletion)
// ʱ�临�Ӷ� O(nlogn)
// �ռ临�Ӷ� O(n)
