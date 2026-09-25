//leetcode 3110
class stringScore {
    public int scoreOfString(String s) {
        int ans=0;
        int n=s.length();
        for(int i=0;i<n-1;i++){
            int ch1=s.charAt(i)-'a';
            int ch2=s.charAt(i+1)-'a';
            ans+=Math.abs(ch1-ch2);
        }
        return ans;
    }
}
