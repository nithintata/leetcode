// Remove K Digits

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();
        if (n == k)
            return "0";
        
        int i = 0;
        while (i < n) {
            while (k > 0 && !st.isEmpty() && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            
            st.push(num.charAt(i++));
        }
        
        while (k > 0) {
            st.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append(st.pop());
        
        sb = sb.reverse();
        
        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        
        return sb.length() == 0 ? "0" : sb.toString();
        
    }
}
