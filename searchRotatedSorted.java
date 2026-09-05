//leetcode solution
class searchRotatedSorted {
    public int binarySearch(int[] nums,int low,int high ,int target) {
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public int findPivotIndex(int[] nums ){
        int s=0;
        int n=nums.length;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<=nums[n-1]){
                e=mid-1;
            }
            else{
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }
    public int search(int[] nums, int target) {
        int s1=0;
        int e1=findPivotIndex(nums);
        int n=nums.length;
        int s2=e1+1;
        int e2=n-1;
        if(e1==-1){
            int ans=binarySearch(nums,0,nums.length-1,target);
            return ans;
        }
        else{
            if(target>=nums[s1]&&target<=nums[e1]){
                int ans=binarySearch(nums,s1,e1,target);
                return ans;
            }
            if(target>=nums[s2]&&target<=nums[e2]){
                int ans=binarySearch(nums,s2,e2,target);
                return ans;
            }
        }
        return -1;
    }
}
