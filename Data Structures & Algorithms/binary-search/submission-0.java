class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int y = nums.length-1;
        while(i<=y){
            int mid = i + (y-i)/2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target){
                i = mid+1;
            } else {
                y = mid-1;
            }
        }
        return -1;
    }
}
