class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, new ArrayList<>(), nums);
        return res;
    }
    private void dfs(int i, List<Integer> c, int[] nums){
        if( i == nums.length ){
            res.add(new ArrayList<>(c));  
            return;
        }
        c.add(nums[i]);
        dfs(i+1, c, nums);
        c.remove(c.size()-1);
        dfs(i+1, c, nums);
    }
}
