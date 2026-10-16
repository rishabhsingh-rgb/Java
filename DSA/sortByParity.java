class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int n=nums.length;
        int j=n-1;
        if(n==0){
            return nums;
        }
        while(i<j){
            if((nums[i]&1)==1 && (nums[j]&1)==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            else if((nums[i]&1)==0){
                i++;
            }
            else if((nums[j]&1)==1){
                j--;
            }
        }
        return nums;
    }
}
