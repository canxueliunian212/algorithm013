学习笔记
哈希表 又称散列表，把关键码值映射到表中的一个位置来加快访问速度

二叉树 单链表的基础上扩展出来的一种数据结构。LinkedList是特殊化的Tree，Tree是特殊化的图
public class TreeNode {
public int val;
public TreeNode left, right;
public TreeNode(int val) {
this.val = val;
this.left = null;
this.right = null;
}
}
二叉树遍历
1.前序（Pre-order）：根-左-右
2.中序（In-order）：左-根-右
3.后序（Post-order）：左-右-根

二叉搜索树 
1. 左子树上所有结点的值均小于它的根结点的值；
2. 右子树上所有结点的值均大于它的根结点的值；
3. 以此类推：左、右子树也分别为二叉查找树


HashMap 小总结
JDK 1.7和1.8关于HashMap实现上有些许区别，1.8以前HashMap的实现是数组+链表，当key的hash值相同但key字面值不同是在同一个数组位置会形成链表，且新元素直接添加到链表的开头，添加元素的时间复杂度时O(1) 查找元素时没有链表结构的直接定位时间复杂度位O(1) ,当存在链表时，时间复杂度就会编程O(n)
JDK1.8后的HashMap实现是数组+链表+ 红黑树的数据结构，发生hash冲突的时候会和JDK1.8之前一样在同一个数组位置形成链表，当链表长度超过8时，就会转换成红黑树结构添加元素的时间复杂度依然是O(1),查找元素是如果存在红黑树，时间复杂度位O(logn)
HashMap 初始的数组大小为16，数组扩大是2的指数倍扩大
