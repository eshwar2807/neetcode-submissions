class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        PriorityQueue<Integer> r = new PriorityQueue<>();
        int q = 0;
        int resultc=1;
        int result=0;
        for (int num : nums){
            r.offer(num);
        }
        q=r.peek();
        while(!r.isEmpty()){
            
            int w = r.poll();
            if(w==q+1){
                resultc = resultc+1; 
            }
            if(w>q+1){
                    resultc =1;
        }
                    q=w;
            result = Math.max(result, resultc);
        
    }return result;}}