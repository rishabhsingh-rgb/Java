class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        int s=low;
        int e=high;
        if(s>=e){
            return;
        }
        //partitioning
        int pivotIndex=partition(arr,s,e);
        //left part rec se sort
        quickSort(arr,s,pivotIndex-1);
        //right part rec se sort
        quickSort(arr,pivotIndex+1,e);
    }

    private int partition(int[] arr, int low, int high) {
        // choose pivot
        //staring element as pivot 
        int s=low;
        int e=high;
        int pivotElement=arr[s];
        // correct position pe rakhdo
        //cont based approach
        int count=0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivotElement){
                count++;
            }
        }
        //place at correct postn
        int correctPosition=s+count;
        //swap
        int temp=arr[correctPosition];
        arr[correctPosition]=arr[s];
        arr[s]=temp;
        
        //ab left aur rigth me chhote bade element place karne hai
        int i=s;
        int j=e;
        while(i<correctPosition && j>correctPosition){
            //left part me check kiya
            while(arr[i]<=pivotElement){
                i++;
            }
            while(arr[j]>pivotElement){
                j--;
            }
            
            if(i<correctPosition && j>correctPosition){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return correctPosition;
        
    }
}
