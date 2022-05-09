import java.util.Scanner;

public class FunctionPP2 {
    public static int greatest(int a, int b){
        if(a>b){

            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greatest is: "+greatest(a, b));
        
    }
    
}
