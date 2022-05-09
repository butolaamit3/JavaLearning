import java.util.Scanner;

public class Calculatorrr { 
    public static void main(String[] args){
        System.out.print("Enter first number: ");

        Scanner scan = new Scanner(System.in);
        Float num_1 = scan.nextFloat();

        System.out.print("Enter second number: ");
        Float num_2 = scan.nextFloat();
        System.out.print("You have Entered ");
        System.out.print(num_1);
        System.out.print(" and ");
        System.out.println(num_2);
        String prompt = "Enter 0 for addition, 1 for " +
                        "subtraction, 2 for multiplication and 3 for division: ";
        System.out.print(prompt);
        int input = scan.nextInt();
        switch (input){
            case 0:
                System.out.println("Adding these numbers");
                System.out.print("The result is: ");
                System.out.println(num_1 + num_2);
                break;

            case 1:
                System.out.println("Subtracting these numbers");
                System.out.print("The result is: ");
                System.out.println(num_1 - num_2);
                break;

            case 2:
                System.out.println("Multiplying these numbers");
                System.out.print("The result is: ");
                System.out.println(num_1 * num_2);
                break;

            case 3:
                System.out.println("Dividing these numbers");
                System.out.print("The result is: ");
                System.out.println(num_1 / num_2);
                break;

            default:
                System.out.println("Invalid input");
            }
        }
    }  
