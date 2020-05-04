//Number Complement
//https://leetcode.com/problems/number-complement/

class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray())
            sb.append(ch == '1' ? '0' : '1');
        return Integer.parseInt(sb.toString(), 2);
    }
}
