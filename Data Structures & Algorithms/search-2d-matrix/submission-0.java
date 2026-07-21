class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] nums : matrix){
            int l = 0;
            int r = nums.length-1;
            while(l<=r){
                int mid = l+(r-l)/2;
                if (nums[mid] == target){
                    return true;
                } else if(nums[mid] < target){
                    l = mid+1;
                } else {
                    r = mid-1;
                }
            }
        }
        return false;
    }
}
