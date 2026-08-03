import java.util.Scanner;

public class primeNum {
    static void isPrime(int num){
        int factor=0;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                factor++;
                break;
            }
        }
        if(factor==0){
            System.out.println(num+" is prime.");
        }
        else{
            System.out.println(num+" is not prime.");
        }
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        isPrime(num);


        sc.close();

    }
}
