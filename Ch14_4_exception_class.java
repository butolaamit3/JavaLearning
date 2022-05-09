// How to create your own custom exception

import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString";
    }
    @Override
    public String getMessage() {
        return "I am getMessage";
    }
}

public class Ch14_4_exception_class {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        if (a<9){
            try{
                // throw new MyException(); // You can use either your custom exception or predefine exception.Z
                throw new ArithmeticException("This is my arithmatic exception"); 

            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace(); 

            }
            System.out.println("Finished Program");
        }
    }
    
}
