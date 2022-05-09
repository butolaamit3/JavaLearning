/*
    Create a class game\, which allow the user to play "Guess the number".
    1. Constructore to generate the random number.
    2. takeUserInpute() to take the user input.
    3. isCorrectNumber to check whether the number entered by the user is true.
    4. getters and setters for noOfGuesses.
    5. use propertiessuch as noOfGuesses(int), to get the task done.
*/


import java.util.Random;
import java.util.Scanner;

class game{

    public int randNumber;
    public int inputNumber;
    public int noOfGuesses = 0;


    game(){
        Random rand = new Random();
        randNumber = rand.nextInt(100);
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses; 
        ;

    }

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    void takeUserInput(){
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == randNumber){
            System.out.printf("You guessed it right..\nYout number is %d and you take %d attempts to guess the number.",randNumber,noOfGuesses);
            return true;
        }
        else if(inputNumber<randNumber){
            System.out.println("Too low..");
        }
        else if(inputNumber>randNumber){
            System.out.println("Too high..");
        }
        return false;

    }

}

public class Ch9_4_gameExercise {
    public static void main(String[] args){
        game g = new game();
        boolean b=false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
        
    }
    
}
