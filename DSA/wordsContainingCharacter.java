class wordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            String word=words[i];
            for(int j=0;j<word.length();j++){
                if(word.charAt(j)==x){
                    l.add(i);
                    break;
                }
            }
        }
        return l;
    }
}
