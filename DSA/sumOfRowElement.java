import java.util.ArrayList;
import java.util.List;

public class sumOfRowElement {
    static List<Integer> rowSum(int[][] arr) {
        int n=arr.length;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            res.add(sum);
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] arr={{1,3,4},
                    {3,6,34,2},
                    {3,3,4}};

        List<Integer> result=rowSum(arr);   
        for(int val:result){
            System.out.print(val+" ");
        }         
    }
}
