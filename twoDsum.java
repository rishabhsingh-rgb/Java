public class twoDsum {
    public static void main(String[] args){
        int[][] arr={{1,2,3},
                    {4,5,6,7,8},
                    {12,24},
                    {78,45,33,66,25,32}};

       int rowLength=arr.length;
       int sum=0;
       for(int i=0;i<rowLength;i++){
        for(int val:arr[i]){
            sum+=val;
        }
       }       
       
       System.out.printf("Summation: %d",sum);
    }
}
