//  Write a function to find the average of a set of number passed as argument.
public class PP5Avg {
    static int avg(int...is){
        int Average = 0;
        int sum = 0;
        for(int a:is){
            Average = a/2;    
            sum += Average;        
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("The average is: "+avg(50,40,10));
        
    }
    
}
