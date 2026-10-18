class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";

        for(String word:words){
            int n=word.length();
            int sum=0;
            for(int i=0;i<n;i++){
                int index=word.charAt(i)-'a';
                sum+=weights[index];
            }
            sum=sum%26;
            ans=ans+(char)('z'-sum);
        }
        return ans;
    }
}
