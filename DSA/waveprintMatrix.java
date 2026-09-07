import java.util.ArrayList;
import java.util.List;

public class wavePrintMatrix {
    static List<Integer> columnSum(int[][] arr) {
        int n=arr[0].length;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if((i&1)==0){
                for(int j=0;j<arr.length;j++){
                    res.add(arr[j][i]);
                }
            }
            else{
                for(int j=arr.length-1;j>=0;j--){
                    res.add(arr[j][i]);
                }
            }
        
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr={{1,3,4},
                    {3,6,34},
                    {3,9,4}};

        List<Integer> result=columnSum(arr);   
        for(int val:result){
            System.out.print(val+" ");
        }         
    }
}
