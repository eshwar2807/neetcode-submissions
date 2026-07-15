class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] r = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            r[i] = 1;
        }
        for (int i = 0; i<nums.length; i++){
            for (int x = 0; x<nums.length; x++){
                if(i != x){
                    r[x] = r[x] * nums[i];
                }
            }
        }
        return r;
    }
}  
