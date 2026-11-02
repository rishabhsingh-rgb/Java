class Solution {
    public int mirrorDistance(int n) {
        int revNum=0;
        int orgNum=n;
        while(n>0){
            int rem=n%10;
            revNum=revNum*10+rem;
            n=n/10;
        }
        return Math.abs(revNum-orgNum);
    }
}
