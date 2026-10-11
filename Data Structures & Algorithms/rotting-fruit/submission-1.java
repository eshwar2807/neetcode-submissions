class Solution {
    public int orangesRotting(int[][] grid) {
        int mc = 0;
        int fc = 0;
        Queue<int[]> q = new ArrayDeque<>();
        for (int i =0; i<grid.length; i++){
            for (int j =0; j<grid[0].length; j++){
                if (grid[i][j]==1){++fc;}
                if (grid[i][j]==2){q.offer(new int[]{i, j});}
            }
        }
        while(!q.isEmpty()&& fc > 0){
            Queue<int[]> qq = new ArrayDeque<>();
            mc++;
            while(!q.isEmpty()){
                int[] p = q.poll();
                int i = p[0];
                int j = p[1];
                if(i+1<grid.length && grid[i+1][j]==1){qq.offer(new int[]{i+1,j}); fc--;grid[i+1][j]=2;}
                if(j+1<grid[0].length && grid[i][j+1]==1){qq.offer(new int[]{i,j+1}); fc--;grid[i][j+1]=2;}
                if(i-1>=0 && grid[i-1][j]==1){qq.offer(new int[]{i-1,j}); fc--;grid[i-1][j]=2;}
                if(j-1>=0 && grid[i][j-1]==1){qq.offer(new int[]{i,j-1}); fc--;grid[i][j-1]=2;}
            }
            q = qq;
        }
        if (fc == 0){
            return mc;
        }
        return -1;
    }
}
