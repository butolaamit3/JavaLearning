// Write a function to print the sum of first n natural number using iterative method.
public class PP7SumIterative {
    static int sum(int n){
        int sum= 0;
        for(int i = 1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sum(10));
    }
    
}
