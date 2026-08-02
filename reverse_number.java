import java.util.Scanner;

public class reverse_number{
    static int reverse(int num){
        int revNum=0;
        while(num>0){
            int rem=num%10;
            revNum=revNum*10+rem;
            num=num/10;
        }
        return revNum;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("Reverse number: "+reverse(num));
        sc.close();
    }
}
