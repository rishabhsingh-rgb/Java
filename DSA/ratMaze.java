class Solution {
    static boolean isSafeToMove(int newX,int newY,int n,int[][] maze,boolean[][] visited){
        if(newX<0 || newX>=n || newY<0 || newY>=n){
            return false;
        }
        else if(maze[newX][newY]==0){
            return false;
        }
        else if(visited[newX][newY]==true){
            return false;
        }
        else{
            return true;
        }
    }
    static void solve(int[][] maze,int srcX, int srcY,int destX,int destY,boolean[][] visited,ArrayList<String> ans,String path){
        //base case
        if(srcX==destX && srcY==destY){
            ans.add(path);
        }
        int n=maze.length;
        visited[srcX][srcY]=true;
        //ab 4 movement hai mere pas
        //up
        int newX=srcX-1;
        int newY=srcY;
        if(isSafeToMove(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destX,destY,visited,ans,path+"U");
        }
        //down
        newX=srcX+1;
        newY=srcY;
        if(isSafeToMove(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destX,destY,visited,ans,path+"D");
        }
        //left
        newX=srcX;
        newY=srcY-1;
        if(isSafeToMove(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destX,destY,visited,ans,path+"L");
        }
        //right
        newX=srcX;
        newY=srcY+1;
        if(isSafeToMove(newX,newY,n,maze,visited)){
            solve(maze,newX,newY,destX,destY,visited,ans,path+"R");
        }
        
        //backTracking step qki charo direction try karli
        visited[srcX][srcY]=false;
        
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        int srcX=0;
        int srcY=0;
        int n=maze.length;
        int destX=n-1;
        int destY=n-1;
        boolean[][] visited=new boolean[n][n];
        ArrayList<String> ans=new ArrayList<>();
        String path="";
        //source or destination blocked
        if(maze[0][0]==0 || maze[n-1][n-1]==0){
            return ans;
        }
        solve(maze,srcX,srcY,destX,destY,visited,ans,path);
        Collections.sort(ans);
        return ans;
        
    }
}
