class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row=0;
        int col=0;
        int ans=0;
        for(int i=0;i<commands.size();i++){
            String command=commands.get(i);
            if(command.equals("DOWN")){
                row++;
            }
            else if(command.equals("UP")){
                row--;
            }
            else if(command.equals("RIGHT")){
                col++;
            }
            else if(command.equals("LEFT")){
                col--;
            }
            ans=row*n+col;
        }
        return ans;
    }
}
