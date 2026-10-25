class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(dfs(board,word,0,i,j))
                        return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word, int index, int i, int j)
    {
        int r=board.length;
        int c=board[0].length;
        if(i>=r || j>=c || i<0 ||j<0)
            return false;
        char temp=board[i][j];
        

        if(word.charAt(index)!=board[i][j])
            return false;
        
        if(index==word.length()-1)
            return true;
        board[i][j]='#';
        boolean found=dfs(board,word,index+1,i+1,j) || dfs(board,word,index+1,i-1,j) || dfs(board,word,index+1,i,j+1) || dfs(board,word,index+1,i,j-1);
        board[i][j]=temp;
        return found;
    }
}
