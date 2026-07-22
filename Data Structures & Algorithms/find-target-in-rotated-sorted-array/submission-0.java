class Solution {
    public int search(int[] nums, int target) {
int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        // which half is sorted?
        if (nums[left] <= nums[mid]) {              // LEFT half is sorted
            if (nums[left] <= target && target < nums[mid]) {
                right = mid - 1;                    // target is in the sorted left half
            } else {
                left = mid + 1;                     // target is in the right half
            }
        } else {                                    // RIGHT half is sorted
            if (nums[mid] < target && target <= nums[right]) {
                left = mid + 1;                     // target is in the sorted right half
            } else {
                right = mid - 1;                    // target is in the left half
            }
        }
    }
    return -1;
    }
}
