// Permutation Sequence

class Solution {
    String res = "";
    boolean found;
    int k;
    public String getPermutation(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = i+1;
        found = false;
        this.k = k;
        boolean[] vis = new boolean[n];
        StringBuilder sb = new StringBuilder();
        backTrack(arr, sb, n,  vis);
        return res;
    }
    
    private void backTrack(int[] arr, StringBuilder sb, int n, boolean[] vis) {
        if (sb.length() == n) {
            if (--k == 0) {
                res = sb.toString();
                found = true;
            }
            return;
        }
        
        for (int i = 0; i < n; i++) {
            if (found)
                return;
            if (vis[i])
                continue;
            vis[i] = true;
            sb.append(arr[i]);
            backTrack(arr, sb, n, vis);
            sb.deleteCharAt(sb.length()-1);
            vis[i] = false;
        }
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
