// Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        /*int pos = Arrays.binarySearch(nums, target);
        if (pos < 0)
            pos = -pos-1;
        return pos;*/
        
        
        int l = 0;
        int r = nums.length - 1;
        int pos = nums.length;
        
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                l = mid + 1;
            else {
                r = mid - 1;
                pos = mid;
            }
        }
        
        return pos;
    }
}
