import java.util.Scanner;

public class Factoriallll {
    public static void main(String[] args){
        System.out.print("Enter the number of which you wnt factprial : ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1;
        for(int i=n;i>=1;i--){
            fact = fact*i;
            System.out.print(i+" X ");

        }
            
        
        System.out.println("="+fact);
        
    }
    
}
