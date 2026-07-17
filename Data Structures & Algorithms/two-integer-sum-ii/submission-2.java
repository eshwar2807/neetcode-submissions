class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int[] ans = new int[2];
        int right = numbers.length-1;
        while(left < right && target != numbers[left]+numbers[right]){
            if(target < numbers[left]+numbers[right]){
                right--;
            }
            if(target > numbers[left]+numbers[right]){
                left++;
            }
        }
            ans[0]=left+1;
            ans[1]=right+1;
            return ans;

    }
}
