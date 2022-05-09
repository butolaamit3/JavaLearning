/*
You have to create a custom calculator with following operations:
1. Addition
2. Subtraction
3. Multipliction
4. Division
Which throws the following exceptions:
1. Invalid input Exception ex: 8 & 9
2. Cannot divide by 0 Exception
3. Max Input Exception if any of the input is greater than 100000
4. Max Multiplier Reached Exception - Don't  allow any multiplication input to be greater than 7000


*/



import java.util.Scanner;

class InvalidInput extends Exception{

    @Override
    public String toString() {
        return "Operator is invalid";
    }

}
class CannotDivide extends Exception{

    @Override
    public String toString() {
        return "You can not divide a number by zero";
    }

}

class MaxInput extends Exception{

    @Override
    public String toString() {
        return "Input can not be greater than 1 lakh";
    }

}

class MaxMultiplierReached extends Exception{

    @Override
    public String toString() {
        return "Input multiplier cannot be greater than seven Thousand";
    }

}

public class Ch14_7_pp4Calculator {
    public static void OperatorCheck(String op) throws InvalidInput{
        if(op == "+"|| op =="-"|| op =="*"||op =="/"){
            throw new InvalidInput();
        }
    }

    public static double sum(int a, int b) throws MaxInput{
        if(a>=100000|| b>=100000){
            throw new MaxInput();
        }
        System.out.println("The value of "+a+ "+"+b+" is: ");
        return a+b;
    }

    public static double subtract(int a, int b) throws MaxInput{
        if(a>=100000|| b>=100000){
            throw new MaxInput();
        }
        System.out.println("The value of "+a+ "-"+b+" is: ");
        return a-b;
    }

    public static double multiply(int a, int b) throws MaxMultiplierReached{
        if(a>=7000|| b>=7000){
            throw new MaxMultiplierReached();
        }
        System.out.println("The value of "+a+ "*"+b+" is: ");
        return a*b;
    }

    public static double divide(int a, int b) throws MaxInput, CannotDivide{
        if(a>=100000|| b>=100000){
            throw new MaxInput();
        }
        if(b==0){
            throw new CannotDivide();
        }
        System.out.println("The value of "+a+ "/"+b+" is: ");
        return a/b;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator For sum +, For subtraction -, For multiplication *, For division /: ");
        String op = sc.next();

        try{
            OperatorCheck(op);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        if(op.equals("+")){
            try{
                System.out.println(sum(a,b));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if(op.equals("-")){
            try{
                System.out.println(subtract(a,b));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if(op.equals("*")){
            try{
                System.out.println(multiply(a,b));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else{
            try{
                System.out.println(divide(a, b));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Program Finished Thankyou");
    }  
}
