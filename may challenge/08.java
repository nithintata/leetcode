// Check If It Is a Straight Line

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 1)
            return true;
        int y = 0;
        int x = 0;
        
        int num = coordinates[1][1] - coordinates[0][1];
        int den = coordinates[1][0] - coordinates[0][0];
        int gcd = gcd(num, den);
        y = num/gcd;
        x = den/gcd;
        
        for (int i = 2; i < coordinates.length; i++) {
            num = coordinates[i][1] - coordinates[i-1][1];
            den = coordinates[i][0] - coordinates[i-1][0];
            gcd = gcd(num, den);
            
            if (y != num/gcd || x != den/gcd)
                return false;
        }
        
        return true;
    }
    
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
