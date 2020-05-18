// Permutation in String

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.isEmpty() || s2.length() < s1.length())
            return false;
        
        if (s1.isEmpty())
            return true;
        
        int[] arr = new int[26];
        for (char ch : s1.toCharArray())
            arr[ch - 'a']++;
        
        int len = s1.length();
        int n = s2.length();
        int[] window = new int[26];
        int i = 0;
        
        while (i < len)
            window[s2.charAt(i++) - 'a']++;
        
        while (i - len < n - len) {
            if (isValid(arr, window))
                return true;
            window[s2.charAt(i - len) - 'a']--;
            window[s2.charAt(i++) - 'a']++;
        }
        
        if (isValid(arr, window))
            return true;
        return false;
    }
    
    private boolean isValid(int[] arr, int[] window) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != window[i])
                return false;
        return true;
    }
}
