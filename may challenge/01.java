//First Bad Version
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1)
            return 1;
        int l = 1;
        int r = n;
        while (l <= r) {
            int mid = l + (r - l)/2;
            boolean isBad = isBadVersion(mid);
            if (isBad) 
                r = mid- 1;
            else
                l = mid + 1;
        }
        return l;
    }
}
