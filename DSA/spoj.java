import java.util.Arrays;

class spoj {
    static boolean isValidAns(int[] arr,long m,long maxHeight){
        long cutWood=0;
        for(int val:arr){
            if(val-maxHeight>0){
                cutWood=cutWood+val-maxHeight; 
        
            }
        }
        if(cutWood>=m){
            return true;
        }
        return false;
    }
    
    int maxHeight(int[] arr, int m) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        long s=0;
        long e=arr[n-1];
        long ans=-1;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(isValidAns(arr,m,mid)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return (int)ans;
    }
   
}
