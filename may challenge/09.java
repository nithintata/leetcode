// Valid Perfect Square

class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 0;
        long r = num;
        while (l < r) {
            long mid = (l+r)/2;
            if (mid * mid == num)
                return true;
            if (mid * mid < num)
                l = mid+1;
            else
                r = mid;
        } 
        
        return l*l == num;
    }
}
