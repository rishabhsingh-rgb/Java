// leetcode 3925
class concatnateReverse {
    public int[] concatWithReverse(int[] nums) {
        int[] ans=new int[2*nums.length];
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            ans[j]=nums[i];
            j++;
        }
        for(int i=n-1;i>=0;i--){
            ans[j]=nums[i];
            j++;
        }
        return ans;
    }
}
