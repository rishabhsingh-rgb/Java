class Solution {
    public String finalString(String s) {
        StringBuilder ans=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='i'){
                ans.reverse();
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
