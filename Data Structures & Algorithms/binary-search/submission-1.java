class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int r = len-1;
        int l = 0;
        
        while(l<=r){
            int m = l+(r-l)/2;
            if(target==nums[l]){
                return l;
            } else if(target==nums[r]) {
                return r;
            }else if(target==nums[m]) {
                return m;
            }else if(target<=nums[m]){
                r = m-1;
            } else if(target>=nums[m]){
                l=m+1;
            } 
        }
        return -1;
    }
}
