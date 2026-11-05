class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<=2){
            return 0;
        }
        int max=nums[n-1];
        int min=nums[0];
        if(max==min){
            return 0;
        }
        int count=0;
        for(int num:nums){
            if(num<max && num>min){
                count++;
            }
        }
        return count;
    }
}
