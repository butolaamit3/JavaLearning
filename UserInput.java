import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){       
        //Taking user input in java
      
        //this is for String
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your Name: ");
    String value = scan.nextLine();  //.nextLine reads the whole Line and scan.next only reads the String until White space comes.
    System.out.println(value);

        //this is for integer
    System.out.print("Enter the age:");
    int age = scan.nextInt();
    System.out.println(age);
    }
    
}
