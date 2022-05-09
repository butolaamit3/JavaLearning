import java.util.Scanner;


public class Conditionalss{
public static void main(String[] args){
    System.out.print("Enter Your age:");
    Scanner scan = new Scanner(System.in);
    int age = scan.nextInt();
    //If - Else Conditionals
    if(age<17){
        System.out.println("You are not elegible for voting");
    }
    else if(age==17){
        System.out.println("You are elegible");
    }
    else{
        System.out.println("You are elegible");
    }
        
    }
}

    
