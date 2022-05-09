// Write a function to print the sum of n odd numbers

public class FunctionPP1 {
    public static int  sumOdd(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(i%2!=0){
                sum = sum +i;
            }
        }
        return sum ;

    }
    public static void main(String[] args) {
        System.out.println(sumOdd(10));
        
        
    }
    
}
