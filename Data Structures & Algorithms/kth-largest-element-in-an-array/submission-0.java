class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> mq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums){
            mq.add(i);
        }
        while(k!=1){
            --k;
            mq.poll();
        }
        return mq.poll();
    }
}
