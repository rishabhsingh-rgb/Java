class Solution {
    public int maximum69Number (int num) {
        int ans=0;
        int[] revArr=new int[4];
        boolean flag=false;
        int i=0;
        while(num>0){
            int digit=num%10;
            revArr[i]=digit;
            num=num/10;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            if(revArr[j]==6 && flag==false){
                ans=ans*10 + 9;
                flag=true;
            }
            else{
                ans=ans*10 + revArr[j];
            }
        }
        return ans;
    }
}
