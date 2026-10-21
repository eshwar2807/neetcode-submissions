class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        dfs(0, nums, target, new ArrayList<>());
        return res;
    }
    private void dfs(int i, int[] nums, int target, List<Integer> c){
        if(target == 0){
            res.add(new ArrayList<>(c));
            return;
        }
        for(int j = i; j<nums.length; ++j){
            if(nums[j]>target){
                break;
            }
            c.add(nums[j]);
            dfs(j, nums, target-nums[j], c);
            c.remove(c.size()-1);
        }

    }
}
