public class sort0and1 {
    static void sort0sand1s(int[] arr){
        int i=0;
        int j=1;
        while(j<arr.length){
            if (arr[i] == 0) {
                i++;
            }
            else if(arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,0,1,1};
        sort0sand1s(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
