//  Find the Town Judge

class Solution {
    public int findJudge(int N, int[][] trust) {
        if (trust.length < N-1)
            return -1;
        
        int[] inDegree = new int[N];
        int[] outDegree = new int[N];
        
        for (int[] arr : trust) {
            inDegree[arr[1] - 1]++;
            outDegree[arr[0] - 1]++;
        }
        
        for (int i = 0; i < N; i++) 
            if (inDegree[i] == N - 1 && outDegree[i] == 0)
                return i+1;
        
        return -1;
    }
}
