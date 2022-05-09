import java.util.Scanner;

public class Method1 {
    public static void printMyName(String name){
        System.out.print("Your name is: "+ name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yout name: ");
        String name = sc.nextLine();
        printMyName(name);

        
        
    }
    
}