class Solution {
    public int[][] kClosest(int[][] points, int k) {
      PriorityQueue<int[]> q = new PriorityQueue<>(
            (a, b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1])
        );
      int[][] a = new int[k][2];
      for (int[] i : points){
        q.offer(i);
      }
      while(k!=0){
        k--;
        a[k] = q.poll();
      }
      return a;
    }
}
