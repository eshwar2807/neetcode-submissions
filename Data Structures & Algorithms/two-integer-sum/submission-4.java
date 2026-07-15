class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> r = new HashMap<>();
        int[] re = new int[2];
        for(int i=0; i<nums.length; i++){
            if (r.containsKey(target-nums[i])){
                re[0] = r.get(target-nums[i]);
                re[1] = i;
            }
            r.put(nums[i], i);
        }
        return re;
    }
}
