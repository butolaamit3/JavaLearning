import java.util.Scanner;

public class Switchhh{
    public static void main(String[] args){
        System.out.print("Enter Your Age: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
    
        //Switch Statement in java: Switch case is used when we have to make a choice between number of alternatives for a given variable.
        switch(age){
            case 12:
            System.out.println("You are not elegible");

            case 16:
            System.out.println("You are not elegible");
            break;
//Switch case execute from the matching condition to all of the below conditions, If you are not using break condition.
            
            case 17:
            System.out.println("You are elegible");
        
            
            case 21:
            System.out.println("You are elegible");

            default:
            System.out.println("You did not match any of the cases");
            
        }
    }
    
}
