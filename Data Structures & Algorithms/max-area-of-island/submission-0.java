class Solution {
    private int area = 0;
    private int at = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i = 0; i<grid.length; ++i){
            for(int j = 0; j<grid[0].length; ++j){
                if(grid[i][j] == 1) area = Math.max(area(grid, i, j),area);
                at = 0;
            }
        }
        return area;
    }
    private int area(int[][] grid, int r, int c){
            if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c] != 1) return at;
            grid[r][c] = 0;
            ++at;
            area(grid,r+1,c);
            area(grid,r-1,c);
            area(grid,r,c+1);
            area(grid,r,c-1);
            return at;
    }
}
