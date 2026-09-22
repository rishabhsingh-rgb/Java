class houseRobber {
    static int solve(int[] nums,int index){
        //base case
        if(index>=nums.length){
            return 0;
        }

        //include & exclude
        int include=nums[index]+solve(nums,index+2);
        int exclude=0+solve(nums,index+1);
        return Math.max(include,exclude);
    }
    public int rob(int[] nums) {
        int index=0;
        int ans=solve(nums,index);
        return ans;
    }
}
