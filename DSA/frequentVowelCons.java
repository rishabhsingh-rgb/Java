//leetcode 3541
class frequentVowelCons {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            int index=ch-'a';
            freq[index]+=1;
        }
        int maxVowel=0;
        int maxCons=0;

        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            if( ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                if( maxVowel<freq[i]){
                    maxVowel=freq[i];
                }
                
            }
            else if(maxCons<freq[i]){
                maxCons=freq[i];
            }
        }
        return maxVowel+maxCons;
    }
}
