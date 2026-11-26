class Solution {
    public boolean checkGoodInteger(int n) {
        int ans=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            ans+=digit*digit;
            ans-=digit;
        }
        if(ans>=50){
            return true;
        }
        return false;
    }
}
