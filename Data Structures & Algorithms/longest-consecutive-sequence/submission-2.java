class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> r = new HashSet<>();
        int best = 0;
        for (int num : nums) r.add(num);
        for (int num : r){
            int length=0;
            if(!(r.contains(num-1))){
                length++;
                while(r.contains(num+length)){
                    length++;
                }
                best = Math.max(best,length);
            }
        
    }return best;}}