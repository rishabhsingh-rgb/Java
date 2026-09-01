public class sorting {
    static void bubbleSort(int[] arr){
        int n=arr.length;
        
        for(int i=0;i<n-1;i++){
            boolean swap=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }

            }
            if(!swap){
                break;
            }
        }
    }

    static void selectionSort(int[] arr){
        int n=arr.length;
        
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    min=j;
                }

            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    static void insertionSort(int[] arr){
        int n=arr.length;
        
        for(int i=1;i<n;i++){
            int curr=i;
            int pre=i-1;
            int currValue=arr[curr];
            while(currValue<arr[pre] && pre>=0){
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=currValue;
        }
            
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        bubbleSort(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        selectionSort(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        insertionSort(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
