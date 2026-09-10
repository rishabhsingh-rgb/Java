//geeksforgeeks
class paintersProblem {
    static boolean isValidAnswer(int[] arr,int k, long maxBoard){
            int painter=1;
            long board=0;
            for(int i=0;i<arr.length;i++){
                if(board+arr[i]<=maxBoard){
                    board+=arr[i];
                }
                else{
                    painter++;
                    board=0;
                    if(maxBoard<arr[i]||painter>k){
                        return false;
                    }
                    else{
                        
                        board+=arr[i];
                    }
                }
            }
            return true;
        }
    
    public int minTime(int[] arr, int k) {
        
        
        long sum=0;
        long s=0;
        long ans=-1;
        for(int val:arr){
            sum+=val;
        }
        long e=sum;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(isValidAnswer(arr,k,mid)){
                e=mid-1;
                ans=mid;
            }
            else{
                s=mid+1;
            }
        }
        return (int)ans;
    }
}
