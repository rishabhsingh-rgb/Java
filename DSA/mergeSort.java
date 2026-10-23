class Solution {
    static void merge(int arr[], int l,int mid, int r){
        int leftArrLen=mid-l+1;
        int rightArrLen=r-mid;
        int leftArr[]=new int[leftArrLen];
        int rightArr[]=new int[rightArrLen];
        int k=l;
        
        for(int i=0;i<leftArrLen;i++){
            leftArr[i]=arr[k];
            k++;
        }
        
        k=mid+1;
        for(int j=0;j<rightArrLen;j++){
            rightArr[j]=arr[k];
            k++;
        }
        
        int i=0,j=0;
        k=l;
        
        while(i<leftArrLen && j<rightArrLen){
            if(leftArr[i]<rightArr[j]){
                arr[k]=leftArr[i];
                i++;
                k++;
            }
            else{
                arr[k]=rightArr[j];
                k++;
                j++;
            }
        }
        
        while(i<leftArrLen){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
    
        
        
        while(j<rightArrLen){
            arr[k]=rightArr[j];
            k++;
            j++;
        }
        
    }
    
    
    public void mergeSort(int arr[], int l, int r) {
        // code here
        int mid=(l+r)/2;
        if(l<r){
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
}
