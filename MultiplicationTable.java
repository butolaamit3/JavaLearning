// Table in reverse order..
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        System.out.print("Enter the number of which you wnt multiplication table : ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =10;i>=1;i--){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
}
