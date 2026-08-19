public class twoUniqueElement {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,7,4,3,2};
        int xor=0;
        for(int num:arr){
            xor^=num;
        }
        int bit=xor&(-xor);

        int a=0;
        int b=0;
        for(int num:arr){
            if((num&bit)!=0){
                a^=num;
            }
            else{
                b^=num;
            }
        }
        System.out.println("Unique numbers: "+ a +", "+b);
    }
    
}
