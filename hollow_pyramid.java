import java.util.Scanner;

public class hollow_pyramid{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=0;j<row-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(i==1 || i==row){
                    System.out.print("* ");
                }
                else if(k==1 || k==2*i-1){
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
