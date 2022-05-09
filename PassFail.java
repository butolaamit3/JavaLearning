import java.util.Scanner;

public class PassFail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yor Physics marks: ");
        int Physics = sc.nextInt();

        System.out.print("Enter yor Chemistry marks: ");
        int Chemistry = sc.nextInt();

        System.out.print("Enter yor Maths marks: ");
        int Maths = sc.nextInt();

        int Total = Physics+Chemistry+Maths;
        float Average =(Total/3.0f);

        if(Average>=40 && Physics>=33 && Chemistry>=33 && Maths>=33){
            System.out.println("Hurra! You are pass");
            System.out.println("Your overall percentage is: " + Average);
        }
        else{
            System.out.println("Better luck next time");
            System.out.println("Your overall percentage is: " + Average);
        }

    }
    
}
