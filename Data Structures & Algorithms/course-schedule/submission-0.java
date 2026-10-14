class Solution {
    private Map<Integer, List<Integer>> m = new HashMap<>();
    private Set<Integer> s = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0; i<numCourses; ++i){
            m.put(i, new ArrayList<>());
        }
        for(int i=0; i<prerequisites.length; ++i){
            m.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for (int c = 0; c < numCourses; c++) {
            if (!dfs(c)) {
                return false;
            }
        }
        return true;
    }
   
    private boolean dfs(int c){
        if(s.contains(c)){
            return false;
        }
        if (m.get(c).isEmpty()){
            return true;
        }
        s.add(c);
        for (int pre : m.get(c)){
            if(!dfs(pre)){
                return false;
            }
        }
        s.remove(c);
        m.put(c, new ArrayList<>());
        return true;
    }

}