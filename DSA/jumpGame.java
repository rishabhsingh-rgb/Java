//leetcode 55
class jumpGame {
    public boolean canJump(int[] nums) {
         int maxReach=0;
         for(int i=0;i<nums.length;i++){
            //agar curr index hi unreachable ho
            if(i>maxReach){
                return false;
            }

            maxReach=Math.max(maxReach,i+nums[i]);
            if(maxReach>=nums.length-1){
                return true;
            }
         }
         return true;
    }
}
