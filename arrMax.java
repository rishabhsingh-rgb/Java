import java.util.Scanner;

public class arrMax {
    public static void main(String[] args){
        int arr[]=new int[10];
        System.out.println("Enter number of values: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter num"+(i+1)+": ");
            arr[i]=sc.nextInt();
            System.out.println();
        }
        int max=arr[0];
        for(int val:arr){
            if(max<val){
                max=val;
            }
        }
        System.out.printf("Max value: %d",max);
        sc.close();
    }
}
