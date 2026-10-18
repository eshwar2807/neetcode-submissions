class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> al = new ArrayList<>();
        int[] inD = new int[numCourses];
        Queue<Integer> q = new ArrayDeque<>();
        int[] o = new int[numCourses];
        int c = 0;
        for(int i = 0; i<numCourses; ++i){
            al.add(new ArrayList<>());
        }
        for (int[] i : prerequisites){
            al.get(i[1]).add(i[0]);
            ++inD[i[0]];
        }
        for(int i = 0; i<numCourses; ++i){
            if(inD[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int i = q.poll();
            o[c++] = i;
            List<Integer> ac = al.get(i);
            for(int j = 0; j<ac.size() ; ++j ){
                int x = ac.get(j);
                --inD[x];
                if(inD[x] == 0){
                    q.offer(x);
                }
            }
        }
        if(c!=numCourses){
            return new int[0];
        }
        return o;
    }
}
