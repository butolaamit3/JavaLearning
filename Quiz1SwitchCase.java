//Quiz1 using switch case print sunday to monday for userInput
import java.util.Scanner;
public class Quiz1SwitchCase {
    public static void main(String[] args){
        System.out.print("Enter the number From 1 to 7: ");
        Scanner scan = new Scanner(System.in);
        int Num = scan.nextInt();
        switch(Num){
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thrusday");
            break;

            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;

            default:
            System.out.println("Please enter the correct number");
            

            
        }

    }
    
}
