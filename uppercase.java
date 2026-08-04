import java.util.Scanner;

public class uppercase {

    static String UpperCase(String str){
        String str2="";
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                str2=str2+((char)(str.charAt(i)-32));
            }
            else{
                str2=str2+str.charAt(i);
            }
        }
        return str2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        // System.out.println((int)str.charAt(10));
        
        System.out.println(UpperCase(str));
        sc.close();
    }

    
}
