class coinChange2Recursion {
    static int solve(int[] coins,int amount,int index){
        //base case
        if(amount==0){
            return 1;
        }
        if(amount<0){
            return 0;
        }
        if(index>=coins.length){
            return 0;
        }

        //include case
        int includeKaAns=solve(coins,amount-coins[index],index);

        //exclude ans
        int excludeKaAns=solve(coins,amount,index+1);

        return includeKaAns+excludeKaAns;
    }
    public int change(int amount, int[] coins) {
        int index=0;
        int ans=solve(coins,amount,index);
        return ans;
    }
}
