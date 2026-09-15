class mostFreqChar {
    public static char getMaxOccuringChar(String s) {
        // code here
        int[] fre=new int[26];
        
        for(int i=0;i<s.length();i++){
            char character=s.charAt(i);
            fre[character - 'a']++;
        }
        
        int max=-1;
        char ans='a';
        
        for(int i=0;i<26;i++){
            if(max<fre[i]){
                max=fre[i];
                ans=(char)(i + 'a');
            }
        }
        return ans;
    }
}
