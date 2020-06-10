// Random Pick with Weight

class Solution {
  Random rand;
  int[] wei;
  public Solution(int[] w) {
    rand = new Random();
    wei = new int[w.length];
    wei[0] = w[0];
    for (int i = 1; i < w.length; i++)
      wei[i] = wei[i - 1] + w[i];
  }

  public int pickIndex() {
    int idx = rand.nextInt(wei[wei.length - 1]) + 1;
    int pos = Arrays.binarySearch(wei, idx);
    return pos >= 0 ? pos : -pos - 1;
  }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */