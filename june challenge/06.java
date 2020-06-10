// Queue Reconstruction by Height

class Solution {
  public int[][] reconstructQueue(int[][] people) {
    int n = people.length;
    Arrays.sort(people, new Comparator<int[]>() {
      public int compare(int[] a, int[] b) {
        if (a[0] != b[0])
          return b[0] - a[0];
        return a[1] - b[1];
      }
    });

    List<int[]> list = new ArrayList<>();
    for (int[] arr : people)
      list.add(arr[1], arr);
    return list.toArray(new int[n][2]);
  }
}

/*let's we are somewhere in between this task and say we have put N persons in
 * the queue so the position of next N+1 th person is just this person's k value
 * because all the person already in the queue has have their height >= this
 * current N+1 th person's height(satisfying the given condition) so just count
 * k person from start and put this current(N+1 th) person at k+1 th index.*/