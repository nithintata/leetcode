// Combination Sum

class Solution {
    List<Integer> arr;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new LinkedList<>();
        arr = new LinkedList<>();
        backTrack(list, 0, 0, candidates, target);
        return list;
    }
    
    private void backTrack(List<List<Integer>> list, int start, int sum, int[] candidates, int target) {
        if (sum > target)
            return;
        if (sum == target) {
            list.add(new LinkedList<>(arr));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            arr.add(candidates[i]);
            backTrack(list, i, sum+candidates[i], candidates, target);
            arr.remove(arr.size() - 1);
        }
    }
}
