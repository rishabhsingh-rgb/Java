public class swapXor {
    public static void main(String[] args) {
        int a=6;
        int b=45;
        
        a=(a^b);
        b=(a^b);
        a=(a^b);
        System.out.printf("After swap: a=%d , b=%d\n",a,b);
        
    }
    
}
