// Throw keyword is used to throw an exception.
// Throws keyword is used to declare an exception, this gives an info to the programmer that there might be an exception.

class NegativeRadiusException extends Exception{ // This is a custom exception this method is written after belows method.
    @Override
    public String toString() {
        return "Radius can not be in negative";
    }
    @Override
    public String getMessage() {
        return "Radius can not be in negative";
    }
}

public class Ch14_5_throw_throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();

        }
        double result = Math.PI*r*r;
        return result;

    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args){
        try{

            int c = divide(6,0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        try{
            double are = area(6);
            System.err.println(are);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
    
}
