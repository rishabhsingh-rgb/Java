//leetcode
class reverseWord {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            //remove all trailing spaces
            while(s.charAt(i)==' '){
                i--;
            }

            if(i<0){
                break;
            }

            //find start index of word
            int j=i;
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            //add word to ans
            ans.append(s.substring(j+1,i+1));

            //find ending index of next word
            while(j>=0 && s.charAt(j)==' '){
                j--;
            }
            // if it is not first word add space
            if(j>=0){
                ans.append(' ');
            }
            i=j;

        }
        return ans.toString();
    }
}
