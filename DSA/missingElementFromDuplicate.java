import java.util.ArrayList;
import java.util.List;

public class missingElementFromDuplicate{
    static List<Integer> missingElements(int[] arr,int n){
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            int val=Math.abs(arr[i]);
            if(arr[val-1]>0){
                arr[val-1]=-arr[val-1];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr={1,4,4,5,2,2};
        List<Integer> res=missingElements(arr,6);
        for(int num:res){
            System.out.println(num);
        }
        
        
    }
}
