//leetcode solution
class searchNearlySorted {
    public int findTarget(int arr[], int target) {
        // code here
        int n=arr.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if((mid-1)>=0 && arr[mid-1]==target){
                return mid-1;
            }
            else if((mid+1)<n && arr[mid+1]==target){
                return mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}
