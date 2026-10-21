class Solution {
    static boolean isSafeToPlace(int rowIndex,int colIndex,int n, char[][] board){
        //hume right aur upar niche check karne ki need nahi hai
        //left horizontal
        int row=rowIndex;
        int col=colIndex;
        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        //upper left diagonal
        row=rowIndex;
        col=colIndex;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        //left lower diagonal
        row=rowIndex;
        col=colIndex;
        while(row<n && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row++;
            col--;
        }

        return true;
    }
    static void solve(char[][] board,int n,int colIndex,List<List<String>> ans){
        //base case
        if(colIndex>=n){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
            
        }

        //1 case mai solve karunga baki recursion
        //current col k har cell pe jake curr col ke har row par jakar 
        //queen place karunga and rest recursion dekh lega
        for(int rowIndex=0;rowIndex<n;rowIndex++){
            if(isSafeToPlace(rowIndex,colIndex,n,board)){
                //place queen
                board[rowIndex][colIndex]='Q';
                //baki recusion
                solve(board,n,colIndex+1,ans);
                //backtracking
                board[rowIndex][colIndex]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        int colIndex=0;
        List<List<String>> ans=new ArrayList<>();
        solve(board,n,colIndex,ans);
        return ans;

    }
}
