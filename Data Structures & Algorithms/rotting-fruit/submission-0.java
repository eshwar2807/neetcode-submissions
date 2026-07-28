class Solution {
        private int fc = 0;
       private Queue<int[]> r = new LinkedList<>();
    public int orangesRotting(int[][] grid) {
        int min = 0;
        for(int i = 0; i<grid.length; ++i){
           for(int j = 0; j<grid[0].length; ++j){
                if(grid[i][j] == 1) ++fc;
                if(grid[i][j] == 2) r.offer(new int[]{i, j});;
            } 
        }
        while(!r.isEmpty() && fc > 0){
            int s = r.size();
            for(int i = 0; i<s; ++i){
                int[] rc = r.poll();
                grid[rc[0]][rc[1]] = 0;
                mr(grid, rc[0]+1, rc[1]);
                mr(grid, rc[0]-1, rc[1]);
                mr(grid, rc[0], rc[1]+1);
                mr(grid, rc[0], rc[1]-1);
            }
            ++min;
        }
        if (fc == 0 ){
            return min;
        } else {
            return -1;
        }
    }
    private void mr(int[][] grid, int row, int col){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col] != 1) return;
        r.offer(new int[]{row,col});
        grid[row][col] = 2; 
        --fc;
    }
}
