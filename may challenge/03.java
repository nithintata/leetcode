//Ransom Note
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (char ch : ransomNote.toCharArray())
            arr[ch - 'a'] -= 1;
        for (char ch : magazine.toCharArray())
            arr[ch - 'a'] += 1;
        
        for (int num : arr)
            if (num < 0)
                return false;
        return true;
    }
}
