学习笔记

使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方

    private static int search(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length -1;
        int mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[start] < nums[mid]) {//说明无序的地方在中间位置后面
                start = mid;
            }else if (nums[start] >= nums[mid])  {//说明无序的地方在中间位置的前面
                end = mid;
            }
        }
        return end;
    }
    最终返回的index是从index开始之后无序