class Solution {
    static int merge(int arr[], int l,int mid, int r){
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
        int invCount=0;

        while(i<leftArrLen && j<rightArrLen){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
                k++;
            }
            else{
                arr[k]=rightArr[j];
                k++;
                j++;
                //inversion logic
                invCount+=leftArrLen-i;
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
        
        return invCount;

    }

    static int mergeSort(int[] arr,int s,int e){
        //base case
        if(s>e){
            return 0;
        }
        if(s==e){
            return 0;
        }
        int mid=(s+e)/2;
    
        int leftInversions=mergeSort(arr,s,mid);
        int rightInversions=mergeSort(arr,mid+1,e);
        int intermediateInversions=merge(arr,s,mid,e);
        int invCount=leftInversions + rightInversions + intermediateInversions; 
        return invCount;
        
    }
    public int inversionCount(int arr[]) {
        // code here
        int ans=mergeSort(arr,0,arr.length-1);
        return ans;
    }
}
