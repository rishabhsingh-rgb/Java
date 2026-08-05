import java.util.Scanner;

public class gcd {
    static int Gcd(int a,int b){
        int ans=0;
        if(b!=0){
            return Gcd(b,a%b);
        }
        else{
            ans=a;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Gcd(a,b));


        sc.close();

    }
}
