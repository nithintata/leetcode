//Jewels and Stones
class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : J.toCharArray())
            map.put(ch, 0);
        for (char ch : S.toCharArray())
            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
        int count = 0;
        for (int num : map.values())
            count += num;
        return count;
    }
}
