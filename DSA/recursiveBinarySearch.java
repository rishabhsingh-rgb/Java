class recursiveBinarySearch {
    static int solve(int[] arr,int target,int low,int high){
        int mid=low+(high-low)/2;
        if(low>high){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return solve(arr,target,low,mid-1);
        }
        else{
            return solve(arr,target,mid+1,high);
        }
    }
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        return(solve(nums,target,low,high));
    }
}
