public class swapAlternate {

    static int[] swapAlternateEle(int[] arr){
        int[] newArr=new int[arr.length];
        
        for(int i=0;i<arr.length-1;i+=2){
            newArr[i]=arr[i+1];
            newArr[i+1]=arr[i];
        }
        

        if ((arr.length & 1) != 0) {
            newArr[arr.length - 1] = arr[arr.length - 1];
        }
       
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr={3,5,6,234,564,24,64,7};
        arr=swapAlternateEle(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    
}
