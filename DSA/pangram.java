//leetcode 1832
class pangram {
    public boolean checkIfPangram(String sentence) {
        int[] arr=new int[26];
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            int index=ch-'a';
            if(arr[index]==0){
                arr[index]=1;
            }
        }
        for(int num:arr){
            if(num==0){
                return false;
            }
        }
        return true;
    }
}
