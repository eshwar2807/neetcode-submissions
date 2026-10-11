class Solution {
    char[][] grid = null;
    private int n = 0;
    public int numIslands(char[][] grid) {
        this.grid = grid;
        for (int i = 0; i<grid.length; ++i){
            for (int j = 0; j<grid[0].length; ++j){
                if (grid[i][j] != '0'){
                    dfs(i,j);
                    n++;
                }
            }
        }
        return n;
    }

    private void dfs(int i, int j){
        if (i<0 || j<0 || i >= grid.length || j >= grid[0].length){return;}
        if (grid[i][j] != '0'){
            grid[i][j] = '0';
            dfs(i-1,j);
            dfs(i,j-1);
            dfs(i+1,j);
            dfs(i,j+1);
        }
    }
}
