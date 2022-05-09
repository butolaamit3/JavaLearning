import java.util.Scanner;

public class Ch14_2_exceptions {
    public static void main(String[] args){
        int [] marks = new int[3];
        marks[0] = 4;
        marks[1] = 44;
        marks[2] = 34;
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter the array index: ");
        int index = sc.nextInt();
        
        System.err.println("Enter the number you want to divide the value with: 4");
        int number = sc.nextInt();

        try{
            System.out.println("The value at array index which you entered is: "+marks[index]);
            System.err.println("The value of array- value/number is: "+marks[index]/number);
        }
        catch(ArithmeticException e){ // Handling specific exception.n
            System.out.println("You can not divide a number by 0 and the exception is: "+e);
        }
        
        catch(ArrayIndexOutOfBoundsException d){ // Handling specific exception.
            System.out.println("You want to find the number at above the length of array"+d);
        }
        
        catch(Exception e){
            System.out.println("Some other exception occured: "+e);
        }
        
    }
    
}
