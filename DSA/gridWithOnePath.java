class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans=new String[m];
        for(int i=0;i<m;i++){
            String seq="";
            for(int j=0;j<n;j++){
                if(j==0){
                    seq=seq+'.';
                }
                else if(i!= m-1 && j!=0){
                    seq=seq+'#';
                }
                else{
                    seq=seq+'.';
                }
            }
            ans[i]=seq;
        }
        return ans;
    }
}
