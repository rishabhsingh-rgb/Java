import java.util.Scanner;

public class stringLength {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        char[] characters=str.toCharArray();
        int length=0;
        for(char ch:characters){
            length+=1;
        }
        System.out.println("length: "+length);
        sc.close();
    
    }
}
