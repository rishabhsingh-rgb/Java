public class firstUnsorted {
    static int getUnsortedElement(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i+1]<arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,8,6,9,22};
        System.out.println("Unsorted element: "+getUnsortedElement(arr));
    }
    
}
