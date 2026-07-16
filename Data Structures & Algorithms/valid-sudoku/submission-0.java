class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for (int j = 0; j<9; j++){
                if(board[i][j] != '.'){
                    if( set.contains(board[i][j])){
                        return false;
                    }
                    set.add(board[i][j]);
                }
        }
        }
        for (int j = 0; j<9; j++){
            Set<Character> set = new HashSet<>();
            for (int i = 0; i<9; i++){
                if(board[i][j] != '.'){
                    if( set.contains(board[i][j])){
                        return false;
                    }
                    set.add(board[i][j]);
                }
        }
        }
        for (int i = 0; i<9; i+=3){
            int z = 0;
            Set<Character> set = new HashSet<>();
            for (int j = 0; j<8; j+=3){
                int y =0;
                for ( y = j; y<j+3; y++){
                for ( z = i; z<i+3; z++){
                if(board[z][y] != '.'){
                    if( set.contains(board[z][y])){
                        return false;
                    }
                    set.add(board[z][y]);
                }
                    }
        }
set = new HashSet<>();
j=y;
            }
            
            i=z;
        }
        return true;
    }
    
}
