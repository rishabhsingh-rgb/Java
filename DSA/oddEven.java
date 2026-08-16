import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        if((num & 1) ==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }


        sc.close(); 

    }
    
}
