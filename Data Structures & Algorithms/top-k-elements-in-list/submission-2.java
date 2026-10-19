class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->(m.get(b)-m.get(a)));
        int[] a = new int[k];
        for(int num : nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(int i : m.keySet()){
            q.offer(i);
        }
        while(k!=0){
            --k;
            a[k] = q.poll();
        }
        return a;
    }
}
