public class arrayReverse {
    static void reverseArray(int [] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

    }
    public static void main(String[] args) {
        int[] arr={3,56,54,67,85,34,63,78};
        reverseArray(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
