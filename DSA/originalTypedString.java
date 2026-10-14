class Solution {
    public int possibleStringCount(String word) {
        int ans=0;
        int n=word.length();
        char old=' ';
        for(int i=0;i<n;i++){
            if(word.charAt(i)==old){
                ans++;
            }
            old=word.charAt(i);
        }
        return ans+1;
    }
}
