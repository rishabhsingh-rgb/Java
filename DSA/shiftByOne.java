public class shiftByOne {
    static void shiftOne(int [] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

    }
    public static void main(String[] args) {
        int[] arr={3,56,54,67,85,34,63,78};
        shiftOne(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
