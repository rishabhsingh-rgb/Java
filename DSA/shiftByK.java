public class shiftByK {
    static void reverseArray(int [] arr,int start,int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    static void shiftK(int [] arr,int k){
        k=k%arr.length;
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr={3,56,54,67,85,34,63,78};
        shiftK(arr,3);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
