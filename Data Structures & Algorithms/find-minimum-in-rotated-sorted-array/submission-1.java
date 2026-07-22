class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int re = nums[0];
        while(l<=r){
            int m = (l+r)/2;
            re = Math.min(re,nums[l]);
            if(nums[m]>=nums[l]){
                re = Math.min(re,nums[m]);
                l = m+1;
            } else {
                re = Math.min(re,nums[m]);
                r = m-1;
            }
        }
        return re;
    }
}
