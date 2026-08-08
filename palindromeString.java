import java.util.Scanner;

public class palindromeString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        String str2="";
        for(int i=str.length()-1;i>=0;i--){
            str2=str2+str.charAt(i);
        }
        if(str.equals(str2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
