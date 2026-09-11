class bookAllocation {
    static boolean isValidAnswer(int[] arr,int k,long maxPages){
            int studentCount=1;
            long pages=0;
            int n=arr.length;
            for(int i=0;i<n;i++){
                if(pages+arr[i]<=maxPages){
                    pages+=arr[i];
                }
                else{
                    studentCount++;
                    if(maxPages<arr[i] || studentCount>k){
                        return false;
                    }
                    else{
                        pages=0;
                        pages+=arr[i];
                    }
                }
            }
        return true;
    }
    
    
    public int findPages(int[] arr, int k) {
        if(arr.length<k){
            return -1;
        }
        // code here
        
        long s=1;
        long sum=0;
        for(int val:arr){
            sum+=val;
        }
        long e=sum;
        long ans=-1;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(isValidAnswer(arr,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return (int)ans;
    }
}
