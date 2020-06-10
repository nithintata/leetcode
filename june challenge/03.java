// Two City Scheduling

class Solution {
  class Comp implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
      return (a[1] - a[0]) - (b[1] - b[0]);
    }
  }
  public int twoCitySchedCost(int[][] costs) {
    Arrays.sort(costs, new Comp());
    int cost = 0;
    int n = costs.length / 2;
    for (int i = 0; i < n; i++)
      cost += costs[i][1];
    for (int i = n; i < 2 * n; i++)
      cost += costs[i][0];
    return cost;
  }
}