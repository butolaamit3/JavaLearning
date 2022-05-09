import java.util.Scanner;

// Write a function to print the fibonachi series of nth term...
// When the question says nth term then series start from 1.
// And when the question says nth index the the series start form 0.
// fib- 0,1,1,2,3,5,8,13,21,34
public class PP4Fibonacci {
    static int fib(int n){
        if (n<=1){
            return n;
        }      
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series: ");
        for(int i = 0;i<=n;i++){ 
            System.out.print(fib(i)+",");

        }
    }
    
}
