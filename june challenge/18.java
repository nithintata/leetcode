// H-Index II

class Solution {
    public int hIndex(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int n = nums.length;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (nums[mid] == n - mid)
                return n - mid;
            if (nums[mid] < n - mid)
                l = mid + 1;
            else
                r = mid - 1;
        }
        
        return n - l;
    }
}
