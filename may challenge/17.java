// Find All Anagrams in a String

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.isEmpty() || p.isEmpty() || s.length() < p.length())
            return list;
        int[] key = new int[26];
        for (char ch : p.toCharArray())
            key[ch - 'a']++;
        
        int[] arr = new int[26];
        int start = 0;
        int n = s.length();
        int end = 0;
        
        while (end < p.length()) 
            arr[s.charAt(end++) - 'a']++;
        
        while (end <= n) {
            if (isValid(arr, key))
                list.add(start);
            
            if (end == n)
                break;
            
            arr[s.charAt(start++) - 'a']--;
            arr[s.charAt(end++) - 'a']++;
        }
        
        return list;
    }
    
    private boolean isValid(int[] arr, int[] key) {
        for (int i = 0; i < 26; i++)
            if (arr[i] != key[i])
                return false;
        return true;
    }
}
