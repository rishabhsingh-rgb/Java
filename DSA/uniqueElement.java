import java.lang.reflect.Array;

public class uniqueElement {
    public static void main(String[] args) {
        int[] arr={12,45,53,34,53,12,45};
        int num=0;
        for(int i=0;i<arr.length;i++){
            num=(num^arr[i]);
        }
        System.out.println(num);
    }
    
}
