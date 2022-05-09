import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
        int userInput = sc.nextInt();

        Random rand = new Random();
        int computerInput = rand.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Game Draw");
        } 
        
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("You Wins");
        } 
        
        else {
            System.out.println("Computer Wins");
        }

        if (computerInput == 0) {
            System.out.println("Computer Choice is: Rock");

        } 
        
        else if (computerInput == 1) {
            System.out.println("Computer Choice is: Paper");
        } 
        
        else {
            System.out.println("Computer Choice is: Scissor");
        }

    }

}
