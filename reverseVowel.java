
class Solution {
    public String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder(s);
        int n=s.length();
        int i=0;
        int j=n-1;

        while (i < j) {
            if ("aeiouAEIOU".indexOf(ans.charAt(i))!= -1 &&
                "aeiouAEIOU".indexOf(ans.charAt(j))!= -1) {

                char temp = ans.charAt(i);
                ans.setCharAt(i,ans.charAt(j));
                ans.setCharAt(j,temp);

                i++;
                j--;
            } else if ("aeiouAEIOU".indexOf(ans.charAt(i))==-1) {
                i++;
            } else {
                j--;
            }
        }

        return ans.toString();
    }
}
