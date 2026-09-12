import java.util.Arrays;

class aggressiveCows {
    static boolean isValidAns(int[] arr,int k,int minDis){
        int n=arr.length;
        int lastposition=0;
        int cowCount=1;
        for(int i=0;i<n;i++){
            if(arr[i]-arr[lastposition]>=minDis){
                lastposition=i;
                cowCount++;
            }
            if(cowCount==k){
                return true;
            }
        }
        return false;
    }
    
    public int aggressiveCow(int[] arr, int k) {
        // code here
        int s=0;
        int n=arr.length;
        Arrays.sort(arr);
        int e=arr[n-1]-arr[0];
        
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidAns(arr,k,mid)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
}
