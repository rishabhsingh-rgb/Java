import java.util.Scanner;

public class hollow_reactangle{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int k=1;k<=6;k++){
                if(i==1 || i==row){
                    System.out.print("* ");
                }
                else if(k==1 || k==6){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
