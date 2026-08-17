import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int orgNum= num; 
        int count=0;
        while(num!=0){
            if((num & 1)!=0){
                //mujhe set bit mil gaya ek
                count++;
            }
            //right shift
            num=num>>1;
        }
        System.out.println("Set Bit: "+count);
        if(count>1){
            System.out.println(orgNum+" not a power of 2.");
        }
        else{
            System.out.println(orgNum+ " a power of 2.");
        }


        // trick
        if((orgNum&(orgNum-1))==0){
            System.out.println(orgNum+ " a power of 2.");
        }
        else{
            System.out.println(orgNum+ " not a power of 2.");
        }


        sc.close();
    }
}
