class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] s = new int[l];
        for(int i = 0; i<l; ++i){
            s[i] = 1;
         }
        int rp = 1;
        for(int i = 0; i<l; ++i){
            s[i] = s[i]*rp;
            rp = rp*nums[i];
         }
         rp = 1;
         for(int i = l; i>0; --i){
            s[i-1] = s[i-1]*rp;
            rp = rp*nums[i-1];
         }
         return s;
    }
}  
