class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<board.length;i++){
            Set<Character>seen=new HashSet<>();
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='.')continue;
                if(seen.contains(board[i][j])==true)return false;
                seen.add(board[i][j]);
            }
        }

        for(int i=0;i<9;i++){
            Set<Character>seen=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.')continue;
                if(seen.contains(board[j][i])==true)return false;
                seen.add(board[j][i]);
            }
        }

        for(int sq=0;sq<9;sq++){
            Set<Character>seen=new HashSet<>();
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int row=(sq/3)*3+i;
                    int col=(sq%3)*3+j;

                    if(board[row][col]=='.')continue;
                    if(seen.contains(board[row][col])==true) return false;
                    seen.add(board[row][col]);
                }
            }
        }
        return true;

    }
}
