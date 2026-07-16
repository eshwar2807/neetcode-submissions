class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] r = new int[nums.length];
        int[] result = new int[nums.length];
        r[0]=1;
        for(int i=1; i<nums.length; i++){
            r[i] = r[i-1] * nums[i-1];
        }
        int right = nums[nums.length-1];
        result[nums.length-1] = r[nums.length-1];
        for(int i=nums.length-1; i>=1; i--){
            result[i-1] = r[i-1] * right;
            right = nums[i-1] * right;
        }
        return result;
    }
}  
// nums = 1 2 4 6

// r = 1 1 2 8 ri = 6

// re = 1 1 12 8

//[48,24,12,8]