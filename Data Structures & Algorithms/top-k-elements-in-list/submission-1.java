class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int num : nums){
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }
PriorityQueue<Integer> r = new PriorityQueue<>((a,b)->(hash.get(a)-hash.get(b)));
for (int count : hash.keySet()){
    r.offer(count);
    if(r.size()>k){
        r.poll();
    }
}
int[] re = new int[k];
for(int i=0 ; i<k ; i++)
{
    re[i]=r.poll();
}
return re;
        }
}
