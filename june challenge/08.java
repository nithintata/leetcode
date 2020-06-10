// Power of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 0)
            return false;
        return Integer.bitCount(n) == 1;
    }
}